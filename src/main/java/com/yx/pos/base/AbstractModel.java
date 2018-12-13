package com.yx.pos.base;

import java.util.Date;

/**
 * 描述：实体的基础类
 * @author lzm
 *
 * @param
 */
public abstract class AbstractModel implements BaseModel {

    protected String createMan;
    protected Date createDate;
    protected String modifyMan;
    protected Date modifyDate;
    protected String isSysFlag;
    protected Long updateFlow;
    protected Date updateTime;
    protected String updateBranch;
    protected String transUpflag;

    public String getTransUpflag() {
        return transUpflag;
    }

    public void setTransUpflag(String transUpflag) {
        this.transUpflag = transUpflag;
    }

    @Override
    public String getCreateMan() {
        return this.createMan;
    }

    @Override
    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    @Override
    public Date getCreateDate() {
        return this.createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public Date getModifyDate() {
        return this.modifyDate;
    }

    @Override
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String getModifyMan() {
        return this.modifyMan;
    }

    @Override
    public void setModifyMan(String modifyMan) {
        this.modifyMan = modifyMan;
    }


    @Override
    public String getIsSysFlag() {
        return this.isSysFlag;
    }

    @Override
    public void setIsSysFlag(String isSysFlag) {
        this.isSysFlag = isSysFlag;
    }

    @Override
    public Date getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public Long getUpdateFlow() {
        return this.updateFlow;
    }

    @Override
    public void setUpdateFlow(Long updateFlow) {
        this.updateFlow = updateFlow;
    }

    @Override
    public String getUpdateBranch() {
        return this.updateBranch;
    }

    @Override
    public void setUpdateBranch(String updateBranch) {
        this.updateBranch = updateBranch;
    }
}
