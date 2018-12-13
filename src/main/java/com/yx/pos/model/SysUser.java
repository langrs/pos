package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class SysUser extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String userId;
    //
    private String operType;
    //
    private String userName;
    //
    private String userPw;
    //
    private String userStatus;
    //
    private String cashierGrant;
    //
    private Double minZk;
    //
    private Double maxGd;
    //
    private Double maxFree;
    //
    private String userLoginPos;
    //
    private String userLoginHT;
    //
    private String userEmpNo;
    //
    private String userCard;
    //
    private String grantPayment;
    //
    private String branchNo;
    //
    private String userLoginWEB;
    //
    private String wxOpenid;
    //
    private String wxGrant;
///////////////////////////////////////////////////////////////
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getOperType() {
        return this.operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPw() {
        return this.userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public String getCashierGrant() {
        return this.cashierGrant;
    }

    public void setCashierGrant(String cashierGrant) {
        this.cashierGrant = cashierGrant;
    }
    public Double getMinZk() {
        return this.minZk;
    }

    public void setMinZk(Double minZk) {
        this.minZk = minZk;
    }
    public Double getMaxGd() {
        return this.maxGd;
    }

    public void setMaxGd(Double maxGd) {
        this.maxGd = maxGd;
    }
    public Double getMaxFree() {
        return this.maxFree;
    }

    public void setMaxFree(Double maxFree) {
        this.maxFree = maxFree;
    }
    public String getUserLoginPos() {
        return this.userLoginPos;
    }

    public void setUserLoginPos(String userLoginPos) {
        this.userLoginPos = userLoginPos;
    }
    public String getUserLoginHT() {
        return this.userLoginHT;
    }

    public void setUserLoginHT(String userLoginHT) {
        this.userLoginHT = userLoginHT;
    }
    public String getUserEmpNo() {
        return this.userEmpNo;
    }

    public void setUserEmpNo(String userEmpNo) {
        this.userEmpNo = userEmpNo;
    }
    public String getUserCard() {
        return this.userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }
    public String getGrantPayment() {
        return this.grantPayment;
    }

    public void setGrantPayment(String grantPayment) {
        this.grantPayment = grantPayment;
    }
    public String getBranchNo() {
        return this.branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }
    public String getUserLoginWEB() {
        return this.userLoginWEB;
    }

    public void setUserLoginWEB(String userLoginWEB) {
        this.userLoginWEB = userLoginWEB;
    }
    public String getWxOpenid() {
        return this.wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }
    public String getWxGrant() {
        return this.wxGrant;
    }

    public void setWxGrant(String wxGrant) {
        this.wxGrant = wxGrant;
    }

}