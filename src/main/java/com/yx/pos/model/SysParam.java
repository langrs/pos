package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class SysParam extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String paramId;
    //
    private String userId;
    //
    private String jh;
    //
    private String paramName;
    //
    private String paramData;
    //
    private String sysFlag;
    //
    private String paramMemo;
///////////////////////////////////////////////////////////////
    public String getParamId() {
        return this.paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getJh() {
        return this.jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }
    public String getParamName() {
        return this.paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }
    public String getParamData() {
        return this.paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }
    public String getSysFlag() {
        return this.sysFlag;
    }

    public void setSysFlag(String sysFlag) {
        this.sysFlag = sysFlag;
    }
    public String getParamMemo() {
        return this.paramMemo;
    }

    public void setParamMemo(String paramMemo) {
        this.paramMemo = paramMemo;
    }

}