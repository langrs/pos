package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class VipIntegralInfo extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String integralNo;
    //
    private String integralName;
    //
    private String integralType;
    //
    private Double oneSaleAmt;
    //
    private Double integralBirthdayRate;
    //
    private String roundType;
    //
    private String integralMemo;
    //
    private String isSysFlag;
    //
    private String createUser;
    //
    private String modifyUser;
    //
    private Double oneIntegral;
    //
    private String integralBirthdayRange;
    //
    private String integralOnlyRealpay;
///////////////////////////////////////////////////////////////
    public String getIntegralNo() {
        return this.integralNo;
    }

    public void setIntegralNo(String integralNo) {
        this.integralNo = integralNo;
    }
    public String getIntegralName() {
        return this.integralName;
    }

    public void setIntegralName(String integralName) {
        this.integralName = integralName;
    }
    public String getIntegralType() {
        return this.integralType;
    }

    public void setIntegralType(String integralType) {
        this.integralType = integralType;
    }
    public Double getOneSaleAmt() {
        return this.oneSaleAmt;
    }

    public void setOneSaleAmt(Double oneSaleAmt) {
        this.oneSaleAmt = oneSaleAmt;
    }
    public Double getIntegralBirthdayRate() {
        return this.integralBirthdayRate;
    }

    public void setIntegralBirthdayRate(Double integralBirthdayRate) {
        this.integralBirthdayRate = integralBirthdayRate;
    }
    public String getRoundType() {
        return this.roundType;
    }

    public void setRoundType(String roundType) {
        this.roundType = roundType;
    }
    public String getIntegralMemo() {
        return this.integralMemo;
    }

    public void setIntegralMemo(String integralMemo) {
        this.integralMemo = integralMemo;
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
    public Double getOneIntegral() {
        return this.oneIntegral;
    }

    public void setOneIntegral(Double oneIntegral) {
        this.oneIntegral = oneIntegral;
    }
    public String getIntegralBirthdayRange() {
        return this.integralBirthdayRange;
    }

    public void setIntegralBirthdayRange(String integralBirthdayRange) {
        this.integralBirthdayRange = integralBirthdayRange;
    }
    public String getIntegralOnlyRealpay() {
        return this.integralOnlyRealpay;
    }

    public void setIntegralOnlyRealpay(String integralOnlyRealpay) {
        this.integralOnlyRealpay = integralOnlyRealpay;
    }

}