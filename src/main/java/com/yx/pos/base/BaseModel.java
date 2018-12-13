package com.yx.pos.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体基础接口
 * @author lzm
 *
 */
public interface BaseModel extends Serializable {
    /**
     * 返回创建人
     * @return String
     */
    String getCreateMan();
    /**
     * 设置人
     * @param createMan 创建人
     */
    void setCreateMan(String createMan);
    /**
     * 返回创建时间
     * @return Date
     */
    Date getCreateDate();
    /**
     * 设置创建时间
     * @param createDate 创建时间
     */
    void setCreateDate(Date createDate);
    /**
     * 返回更新时间
     * @return Date
     */
    Date getModifyDate();
    /**
     * 设置更新时间
     * @param modifyDate 最后更新时间
     */
    void setModifyDate(Date modifyDate);
    /**
     * 返回更新人
     * @return String
     */
    String getModifyMan();
    /**
     * 设置更新人
     * @param modifyMan 最后更新人
     */
    void setModifyMan(String modifyMan);

    String getIsSysFlag();

    void setIsSysFlag(String isSysFlag);

    Date getUpdateTime();

    void setUpdateTime(Date updateTime);

    Long getUpdateFlow();

    void setUpdateFlow(Long updateFlow);

    String getUpdateBranch();

    void setUpdateBranch(String updateBranch);
}
