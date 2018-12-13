package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosAllDiscount extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String sheetNo;
    //
    private String branchNo;
    //
    private Date startDate;
    //
    private Date endDate;
    //
    private String startTime;
    //
    private String endTime;
    //
    private String discountNo;
    //
    private String userId;
    //
    private Date operDate;
    //
    private String useStatus;
    //
    private String isStop;
    //
    private Date stopDate;
    //
    private String stopUser;
    //
    private String viptypeNo;
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
    public String getDiscountNo() {
        return this.discountNo;
    }

    public void setDiscountNo(String discountNo) {
        this.discountNo = discountNo;
    }
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Date getOperDate() {
        return this.operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }
    public String getUseStatus() {
        return this.useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }
    public String getIsStop() {
        return this.isStop;
    }

    public void setIsStop(String isStop) {
        this.isStop = isStop;
    }
    public Date getStopDate() {
        return this.stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }
    public String getStopUser() {
        return this.stopUser;
    }

    public void setStopUser(String stopUser) {
        this.stopUser = stopUser;
    }
    public String getViptypeNo() {
        return this.viptypeNo;
    }

    public void setViptypeNo(String viptypeNo) {
        this.viptypeNo = viptypeNo;
    }

}