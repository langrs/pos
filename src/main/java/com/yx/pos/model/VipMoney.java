package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class VipMoney extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String vipNo;
    //
    private String branchNo;
    //
    private String moneyType;
    //
    private Double vipSort;
    //
    private Double valueAmt;
    //
    private Double useAmt;
    //
    private String ctrlValid;
    //
    private Date validSdate;
    //
    private Date validEdate;
    //
    private String fromBranch;
    //
    private String voucherNo;
    //
    private String memo;
    //
    private String createUser;
///////////////////////////////////////////////////////////////
    public String getVipNo() {
        return this.vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo;
    }
    public String getBranchNo() {
        return this.branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }
    public String getMoneyType() {
        return this.moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }
    public Double getVipSort() {
        return this.vipSort;
    }

    public void setVipSort(Double vipSort) {
        this.vipSort = vipSort;
    }
    public Double getValueAmt() {
        return this.valueAmt;
    }

    public void setValueAmt(Double valueAmt) {
        this.valueAmt = valueAmt;
    }
    public Double getUseAmt() {
        return this.useAmt;
    }

    public void setUseAmt(Double useAmt) {
        this.useAmt = useAmt;
    }
    public String getCtrlValid() {
        return this.ctrlValid;
    }

    public void setCtrlValid(String ctrlValid) {
        this.ctrlValid = ctrlValid;
    }
    public Date getValidSdate() {
        return this.validSdate;
    }

    public void setValidSdate(Date validSdate) {
        this.validSdate = validSdate;
    }
    public Date getValidEdate() {
        return this.validEdate;
    }

    public void setValidEdate(Date validEdate) {
        this.validEdate = validEdate;
    }
    public String getFromBranch() {
        return this.fromBranch;
    }

    public void setFromBranch(String fromBranch) {
        this.fromBranch = fromBranch;
    }
    public String getVoucherNo() {
        return this.voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

}