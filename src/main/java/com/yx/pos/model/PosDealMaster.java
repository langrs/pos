package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosDealMaster extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String dealNo;
    //
    private String branchNo;
    //
    private String dealClass;
    //
    private String userId;
    //
    private String jh;
    //
    private Date startDate;
    //
    private String startSheetNo;
    //
    private Double startAmt;
    //
    private Date endDate;
    //
    private String endSheetNo;
    //
    private Long sheetCnt;
    //
    private Double sheetSaleAmt;
    //
    private Double sheetReturnAmt;
    //
    private String appUser;
    //
    private String dealStatus;
    //
    private String dealMemo;
    //
    private String appSign;
    //
    private String cmFlag;
    //
    private String cashMemo;
///////////////////////////////////////////////////////////////
    public String getDealNo() {
        return this.dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo;
    }
    public String getBranchNo() {
        return this.branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }
    public String getDealClass() {
        return this.dealClass;
    }

    public void setDealClass(String dealClass) {
        this.dealClass = dealClass;
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
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String getStartSheetNo() {
        return this.startSheetNo;
    }

    public void setStartSheetNo(String startSheetNo) {
        this.startSheetNo = startSheetNo;
    }
    public Double getStartAmt() {
        return this.startAmt;
    }

    public void setStartAmt(Double startAmt) {
        this.startAmt = startAmt;
    }
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getEndSheetNo() {
        return this.endSheetNo;
    }

    public void setEndSheetNo(String endSheetNo) {
        this.endSheetNo = endSheetNo;
    }
    public Long getSheetCnt() {
        return this.sheetCnt;
    }

    public void setSheetCnt(Long sheetCnt) {
        this.sheetCnt = sheetCnt;
    }
    public Double getSheetSaleAmt() {
        return this.sheetSaleAmt;
    }

    public void setSheetSaleAmt(Double sheetSaleAmt) {
        this.sheetSaleAmt = sheetSaleAmt;
    }
    public Double getSheetReturnAmt() {
        return this.sheetReturnAmt;
    }

    public void setSheetReturnAmt(Double sheetReturnAmt) {
        this.sheetReturnAmt = sheetReturnAmt;
    }
    public String getAppUser() {
        return this.appUser;
    }

    public void setAppUser(String appUser) {
        this.appUser = appUser;
    }
    public String getDealStatus() {
        return this.dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }
    public String getDealMemo() {
        return this.dealMemo;
    }

    public void setDealMemo(String dealMemo) {
        this.dealMemo = dealMemo;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public void setAppSign(String appSign) {
        this.appSign = appSign;
    }
    public String getCmFlag() {
        return this.cmFlag;
    }

    public void setCmFlag(String cmFlag) {
        this.cmFlag = cmFlag;
    }
    public String getCashMemo() {
        return this.cashMemo;
    }

    public void setCashMemo(String cashMemo) {
        this.cashMemo = cashMemo;
    }

}