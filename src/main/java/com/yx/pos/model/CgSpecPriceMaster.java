package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class CgSpecPriceMaster extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String sheetNo;
    //
    private String branchNo;
    //
    private String supNo;
    //
    private String manageType;
    //
    private Date operDate;
    //
    private Date startDate;
    //
    private Date endDate;
    //
    private String userId;
    //
    private String appSign;
    //
    private String appUser;
    //
    private Date appDate;
    //
    private String memo;
    //
    private String bytxt1;
    //
    private String bytxt2;
    //
    private String bytxt3;
    //
    private Double bynum1;
    //
    private Double bynum2;
    //
    private Double bynum3;
    //
    private String createBranch;
    //
    private String cgspecType;
    //
    private String startTime;
    //
    private String endTime;
///////////////////////////////////////////////////////////////
    public String getSheetNo() {
        return this.sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }
    public String getBranchNo() {
        return this.branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }
    public String getSupNo() {
        return this.supNo;
    }

    public void setSupNo(String supNo) {
        this.supNo = supNo;
    }
    public String getManageType() {
        return this.manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }
    public Date getOperDate() {
        return this.operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public void setAppSign(String appSign) {
        this.appSign = appSign;
    }
    public String getAppUser() {
        return this.appUser;
    }

    public void setAppUser(String appUser) {
        this.appUser = appUser;
    }
    public Date getAppDate() {
        return this.appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getBytxt1() {
        return this.bytxt1;
    }

    public void setBytxt1(String bytxt1) {
        this.bytxt1 = bytxt1;
    }
    public String getBytxt2() {
        return this.bytxt2;
    }

    public void setBytxt2(String bytxt2) {
        this.bytxt2 = bytxt2;
    }
    public String getBytxt3() {
        return this.bytxt3;
    }

    public void setBytxt3(String bytxt3) {
        this.bytxt3 = bytxt3;
    }
    public Double getBynum1() {
        return this.bynum1;
    }

    public void setBynum1(Double bynum1) {
        this.bynum1 = bynum1;
    }
    public Double getBynum2() {
        return this.bynum2;
    }

    public void setBynum2(Double bynum2) {
        this.bynum2 = bynum2;
    }
    public Double getBynum3() {
        return this.bynum3;
    }

    public void setBynum3(Double bynum3) {
        this.bynum3 = bynum3;
    }
    public String getCreateBranch() {
        return this.createBranch;
    }

    public void setCreateBranch(String createBranch) {
        this.createBranch = createBranch;
    }
    public String getCgspecType() {
        return this.cgspecType;
    }

    public void setCgspecType(String cgspecType) {
        this.cgspecType = cgspecType;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}