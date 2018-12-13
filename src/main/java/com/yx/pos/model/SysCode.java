package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class SysCode extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String codeType;
    //
    private String codeNo;
    //
    private String codeName;
    //
    private String codeCharflag;
    //
    private Double codeNumflag;
    //
    private String memo;
    //
    private String ver;
    //
    private String isSysFlag;
///////////////////////////////////////////////////////////////
    public String getCodeType() {
        return this.codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }
    public String getCodeNo() {
        return this.codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo;
    }
    public String getCodeName() {
        return this.codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
    public String getCodeCharflag() {
        return this.codeCharflag;
    }

    public void setCodeCharflag(String codeCharflag) {
        this.codeCharflag = codeCharflag;
    }
    public Double getCodeNumflag() {
        return this.codeNumflag;
    }

    public void setCodeNumflag(Double codeNumflag) {
        this.codeNumflag = codeNumflag;
    }
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getVer() {
        return this.ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }
    public String getIsSysFlag() {
        return this.isSysFlag;
    }

    public void setIsSysFlag(String isSysFlag) {
        this.isSysFlag = isSysFlag;
    }

}