package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosStamptype extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String stampTypeNo;
    //
    private String stampTypeName;
    //
    private Double stampAmt;
    //
    private String stampTypeIsZero;
    //
    private String stampTypeMemo;
    //
    private String dateUnit;
    //
    private Long stampTypePeriod;
    //
    private String isSysFlag;
    //
    private String createUser;
    //
    private String modifyUser;
    //
    private String isFixedValid;
    //
    private Double payruleSaleAmt;
    //
    private Long payruleLimitInt;
    //
    private String payruleLimitSp;
///////////////////////////////////////////////////////////////
    public String getStampTypeNo() {
        return this.stampTypeNo;
    }

    public void setStampTypeNo(String stampTypeNo) {
        this.stampTypeNo = stampTypeNo;
    }
    public String getStampTypeName() {
        return this.stampTypeName;
    }

    public void setStampTypeName(String stampTypeName) {
        this.stampTypeName = stampTypeName;
    }
    public Double getStampAmt() {
        return this.stampAmt;
    }

    public void setStampAmt(Double stampAmt) {
        this.stampAmt = stampAmt;
    }
    public String getStampTypeIsZero() {
        return this.stampTypeIsZero;
    }

    public void setStampTypeIsZero(String stampTypeIsZero) {
        this.stampTypeIsZero = stampTypeIsZero;
    }
    public String getStampTypeMemo() {
        return this.stampTypeMemo;
    }

    public void setStampTypeMemo(String stampTypeMemo) {
        this.stampTypeMemo = stampTypeMemo;
    }
    public String getDateUnit() {
        return this.dateUnit;
    }

    public void setDateUnit(String dateUnit) {
        this.dateUnit = dateUnit;
    }
    public Long getStampTypePeriod() {
        return this.stampTypePeriod;
    }

    public void setStampTypePeriod(Long stampTypePeriod) {
        this.stampTypePeriod = stampTypePeriod;
    }
    public String getIsSysFlag() {
        return this.isSysFlag;
    }

    public void setIsSysFlag(String isSysFlag) {
        this.isSysFlag = isSysFlag;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    public String getModifyUser() {
        return this.modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
    public String getIsFixedValid() {
        return this.isFixedValid;
    }

    public void setIsFixedValid(String isFixedValid) {
        this.isFixedValid = isFixedValid;
    }
    public Double getPayruleSaleAmt() {
        return this.payruleSaleAmt;
    }

    public void setPayruleSaleAmt(Double payruleSaleAmt) {
        this.payruleSaleAmt = payruleSaleAmt;
    }
    public Long getPayruleLimitInt() {
        return this.payruleLimitInt;
    }

    public void setPayruleLimitInt(Long payruleLimitInt) {
        this.payruleLimitInt = payruleLimitInt;
    }
    public String getPayruleLimitSp() {
        return this.payruleLimitSp;
    }

    public void setPayruleLimitSp(String payruleLimitSp) {
        this.payruleLimitSp = payruleLimitSp;
    }

}