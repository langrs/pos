package com.yx;

import freemarker.template.Template;
import org.springframework.util.StringUtils;

import java.io.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    private final String AUTHOR = "lzm";
    private final String CURRENT_DATE = "2018/09/07";
    private final String tableName = "t_sys_user";
    private final String packageName = "com.yx.pos";
    private final String tableAnnotation = "质量问题";
    //    private final String URL = "jdbc:mysql://localhost:3306/bcgame";
    private final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=yta5sypro_01";
    private final String USER = "sa";
    private final String PASSWORD = "1";
    //    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    private final String diskPath = "D:\\project\\java\\pos\\src\\main\\java\\com\\yx\\codegen\\";
//    private final String mapperPath = "D:\\work\\java\\workspace\\bcgame\\codegen\\src\\resources\\com\\wm\\bcgame\\";
    private final String diskPath = "D:\\project\\java\\pos\\codegen\\src\\main\\java\\com\\yx\\pos\\";
    private final String mapperPath = "D:\\project\\java\\pos\\codegen\\src\\main\\resources\\com\\yx\\pos\\";

    private final String IGNOR = "trans_upflag,update_branch,create_man,create_date,modify_man,modify_date,isSysFlag,,update_flow,update_time,";
    //    private final String changeTableName = replaceUnderLineAndUpperCase(tableName);
    private String changeTableName;
    private TableInfo tableInfo = new TableInfo();

    public static void main(String[] args) throws Exception {

        App codeGenerateUtils = new App();
        codeGenerateUtils.generate();
    }

    public Connection getConnection() throws Exception {
        Class.forName(DRIVER);
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }

    public void generate() throws Exception {
        try {
            Connection connection = getConnection();
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            String[] tablesList ={
//                    系统相关
                    "t_sys_user","t_sys_workstation","t_data_payment","t_sys_code",
                    "t_sys_param","t_data_coin",
//                    会员相关
                    "t_vip_info","t_vip_type_info",
                    "t_vip_type_detail","t_vip_flow","t_vip_money",
                    "t_vip_integral_info","t_vip_integral_detail",
                    "t_vip_discount_detail","t_vip_discount_info",
//                    券相关
                    "t_vip_integral_stamp","t_pos_stamp_info","t_pos_stamptype",
//                  销售表
                    "t_pos_sale_master","t_pos_sale_detail","t_pos_sale_payment",
//                    促销相关
                    "t_pos_sp_master","t_pos_sp_detail","t_pos_give_master","t_pos_give_detail",
                    "t_pos_give_item","t_cg_specPrice_master","t_cg_specPrice_detail",
                    "t_pos_all_discount",
//                    交班单
                    "t_pos_deal_master","t_pos_deal_detail",
//                  基本信息相关
                   "t_item_info","t_counter_info","t_sup_info","t_item_pack"};
//            获取所有需要处理的表
            for(String tbName:tablesList){
                ResultSet tables = databaseMetaData.getTables(null, "%", tbName, new String[]{"TABLE"});
                while (tables.next()) {
                    String tableName = tables.getString("TABLE_NAME");
    //                changeTableName = replaceUnderLineAndUpperCase(tableName).substring(1);
                    System.out.println(tableName);
                    tableInfo.setTableName(tableName);
                    tableInfo.setChangeTableName(replaceUnderLineAndUpperCase(tableName).substring(1));
                    tableInfo.setTableAnnotation("");
                    ResultSet resultSet = databaseMetaData.getColumns(null, "%", tableName, "%");
    //                生成字段信息
                    List<ColumnClass> columnClassList = new ArrayList<>();
                    ColumnClass columnClass = null;
                    while (resultSet.next()) {
                        //id字段略过
    //                    if(resultSet.getString("COLUMN_NAME").equals("id")) continue;
                        columnClass = new ColumnClass();
                        //获取字段名称
                        columnClass.setColumnName(resultSet.getString("COLUMN_NAME"));
                        //获取字段类型
                        columnClass.setColumnType(resultSet.getString("TYPE_NAME").toLowerCase());
    //                    转换jdbc类型
                        columnClass.setColumnTypeJdbc(changeJdbcType(columnClass.getColumnType()));
                        //转换字段名称，如 sys_name 变成 SysName
                        columnClass.setChangeColumnName(toLowerCaseFirstOne(replaceUnderLineAndUpperCase(resultSet.getString("COLUMN_NAME"))));
                        //字段在数据库的注释
                        columnClass.setColumnComment(resultSet.getString("REMARKS"));
    //            排除特定基列字段
                        if (IGNOR.indexOf(columnClass.getColumnName()) >= 0) {
                            columnClass.setIgnore(true);
                        } else {
                            columnClass.setIgnore(false);
                        }

                        columnClassList.add(columnClass);
                        System.out.println(columnClass);
                    }
                    Map<String, Object> dataMap = new HashMap<>();
                    dataMap.put("model_column", columnClassList);
    //                //生成实体类
                    generateModelFile(dataMap);
    //                //生成Dao文件
                    generateDaoFile(resultSet);
    //                //生成Mapper文件
                    generateMapperFile(dataMap);
    //                //生成服务层接口文件
                    generateServiceInterfaceFile(dataMap);
    //                //生成服务实现层文件
                    generateServiceImplFile(dataMap);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
    }

    //生成实体类
    private void generateModelFile(Map<String, Object> dataMap) throws Exception {

        final String suffix = ".java";
        final String pkgname = "model\\";
        final String path = diskPath + pkgname + tableInfo.changeTableName + suffix;
        final String templateName = "Model.ftl";
        File mapperFile = new File(path);
        generateFileByTemplate(templateName, mapperFile, dataMap);

    }


    private void generateControllerFile(ResultSet resultSet) throws Exception {
        final String suffix = "Controller.java";
        final String path = diskPath + changeTableName + suffix;
        final String templateName = "Controller.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        generateFileByTemplate(templateName, mapperFile, dataMap);
    }

    private void generateServiceImplFile(Map<String,Object> dataMap) throws Exception {
        final String suffix = "ServiceImpl.java";
        final String pkgname = "service\\impl\\";
        final String path = diskPath + pkgname + tableInfo.changeTableName + suffix;
        final String templateName = "ServiceImpl.ftl";
        File mapperFile = new File(path);
        generateFileByTemplate(templateName, mapperFile, dataMap);
    }

    private void generateServiceInterfaceFile(Map<String,Object> dataMap) throws Exception {
        final String suffix = "Service.java";
        final String pkgname = "service\\";
        final String path = diskPath + pkgname + tableInfo.changeTableName + suffix;
        final String templateName = "ServiceInterface.ftl";
        File mapperFile = new File(path);
        generateFileByTemplate(templateName, mapperFile, dataMap);
    }


    private void generateDaoFile(ResultSet resultSet) throws Exception {
        final String suffix = "Dao.java";
        final String pkgname = "dao\\";
        final String path = diskPath + pkgname + tableInfo.changeTableName + suffix;
        final String templateName = "DAO.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap<>();
        generateFileByTemplate(templateName, mapperFile, dataMap);

    }

    private void generateMapperFile(Map<String, Object> dataMap) throws Exception {
        final String suffix = "Dao.xml";
        final String pkgname = "dao\\";
        final String path = mapperPath + pkgname + tableInfo.changeTableName + suffix;
        final String templateName = "Mapper.ftl";
        File mapperFile = new File(path);
        generateFileByTemplate(templateName, mapperFile, dataMap);

    }

    //通过freemaker模板生成文件
    private void generateFileByTemplate(final String templateName, File file, Map<String, Object> dataMap) throws Exception {
        Template template = FreeMarkerTemplateUtils.getTemplate(templateName);
        FileOutputStream fos = new FileOutputStream(file);
        dataMap.put("table_name_small", tableInfo.getTableName());
        dataMap.put("table_name", tableInfo.getChangeTableName());
        dataMap.put("author", AUTHOR);
        dataMap.put("date", CURRENT_DATE);
        dataMap.put("package_name", packageName);
        dataMap.put("table_annotation", tableInfo.getTableAnnotation());
        Writer out = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"), 10240);
        template.process(dataMap, out);
    }

    //将下划线的表名称替换为驼峰命名,如果下划线后是大写,维持不变
    public String replaceUnderLineAndUpperCase(String str) {
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        int count = sb.indexOf("_");
        while (count != 0) {
            int num = sb.indexOf("_", count);
            count = num + 1;
            if (num != -1) {
                char ss = sb.charAt(count);
                char ia;
                if(ss > 90){
                     ia = (char) (ss - 32);
                }else{
                     ia = ss;
                }

                sb.replace(count, count + 1, ia + "");
            }
        }
        String result = sb.toString().replaceAll("_", "");
        return StringUtils.capitalize(result);
    }

    //首字母转小写
    public String toLowerCaseFirstOne(String str) {
        if(Character.isLowerCase(str.charAt(0))){
            return str;
        }else{
            return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
        }
    }

    //转换jdbctype
    private String changeJdbcType(String type){
        String jdbcType = "";
        switch (type){
            case "int":jdbcType = "NUMERIC";break;
            case "smallint":jdbcType="NUMERIC";break;
            case "datetime":jdbcType="TIMESTAMP";break;
            case "varchar":jdbcType="VARCHAR";break;
            case "text":jdbcType="VARCHAR";break;
            case "number":jdbcType="NUMERIC";break;
            case "decimal":jdbcType="NUMERIC";break;
            case "nvarchar":jdbcType="VARCHAR";break;
            case "char":jdbcType="VARCHAR";break;
            case "numeric":jdbcType="NUMERIC";break;
        }
        return jdbcType;
    }
    public class TableInfo{
        private String packageName;
        private String tableAnnotation;
        private String tableName;
        private String changeTableName;

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getTableAnnotation() {
            return tableAnnotation;
        }

        public void setTableAnnotation(String tableAnnotation) {
            this.tableAnnotation = tableAnnotation;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getChangeTableName() {
            return changeTableName;
        }

        public void setChangeTableName(String changeTableName) {
            this.changeTableName = changeTableName;
        }
    }

}
