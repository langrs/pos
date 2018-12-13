package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosStampInfo extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String stampNo;
    //
    private String stampTypeNo;
    //
    private String vipNo;
    //
    private Double stampAmt;
    //
    private String stampStatus;
    //
    private Date stampStartDate;
    //
    private Date stampEndDate;
    //
    private String stampIssueType;
    //
    private Date stampIssueDate;
    //
    private String stampIssueMan;
    //
    private String stampIssueSheet;
    //
    private String stampUseSheet;
    //
    private Date stampUseDate;
    //
    private String stampMemo;
    //
    private String createUser;
    //
    private String modifyUser;
    //
    private String branchNo;
///////////////////////////////////////////////////////////////
    public String getStampNo() {
        return this.stampNo;
    }

    public void setStampNo(String stampNo) {
        this.stampNo = stampNo;
    }
    public String getStampTypeNo() {
        return this.stampTypeNo;
    }

    public void setStampTypeNo(String stampTypeNo) {
        this.stampTypeNo = stampTypeNo;
    }
    public String getVipNo() {
        return this.vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo;
    }
    public Double getStampAmt() {
        return this.stampAmt;
    }

    public void setStampAmt(Double stampAmt) {
        this.stampAmt = stampAmt;
    }
    public String getStampStatus() {
        return this.stampStatus;
    }

    public void setStampStatus(String stampStatus) {
        this.stampStatus = stampStatus;
    }
    public Date getStampStartDate() {
        return this.stampStartDate;
    }

    public void setStampStartDate(Date stampStartDate) {
        this.stampStartDate = stampStartDate;
    }
    public Date getStampEndDate() {
        return this.stampEndDate;
    }

    public void setStampEndDate(Date stampEndDate) {
        this.stampEndDate = stampEndDate;
    }
    public String getStampIssueType() {
        return this.stampIssueType;
    }

    public void setStampIssueType(String stampIssueType) {
        this.stampIssueType = stampIssueType;
    }
    public Date getStampIssueDate() {
        return this.stampIssueDate;
    }

    public void setStampIssueDate(Date stampIssueDate) {
        this.stampIssueDate = stampIssueDate;
    }
    public String getStampIssueMan() {
        return this.stampIssueMan;
    }

    public void setStampIssueMan(String stampIssueMan) {
        this.stampIssueMan = stampIssueMan;
    }
    public String getStampIssueSheet() {
        return this.stampIssueSheet;
    }

    public void setStampIssueSheet(String stampIssueSheet) {
        this.stampIssueSheet = stampIssueSheet;
    }
    public String getStampUseSheet() {
        return this.stampUseSheet;
    }

    public void setStampUseSheet(String stampUseSheet) {
        this.stampUseSheet = stampUseSheet;
    }
    public Date getStampUseDate() {
        return this.stampUseDate;
    }

    public void setStampUseDate(Date stampUseDate) {
        this.stampUseDate = stampUseDate;
    }
    public String getStampMemo() {
        return this.stampMemo;
    }

    public void setStampMemo(String stampMemo) {
        this.stampMemo = stampMemo;
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
    public String getBranchNo() {
        return this.branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

}