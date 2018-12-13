package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosSaleMaster extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String sheetNo;
    //
    private Date operDate;
    //
    private Date saleTime;
    //
    private String posType;
    //
    private String posStatus;
    //
    private String dealNo;
    //
    private String dealClass;
    //
    private String userId;
    //
    private String branchNo;
    //
    private String counterNo;
    //
    private String jh;
    //
    private String localNo;
    //
    private String workNo;
    //
    private String voucherNo;
    //
    private String vipNo;
    //
    private Double posOrgAmt;
    //
    private Double posTotalAmt;
    //
    private Double posIntegral;
    //
    private String custName;
    //
    private String custMan;
    //
    private String custAddress;
    //
    private String custTel;
    //
    private String custRequest;
    //
    private Date posOrderTime;
    //
    private Date posSendTime;
    //
    private String dealOrder;
    //
    private String posMemo;
    //
    private String posBytxt1;
    //
    private String posBytxt2;
    //
    private String posBytxt3;
    //
    private Long fuTimes;
    //
    private String posOrderIsSend;
    //
    private String posOrderStatus;
    //
    private String posOrderSender;
    //
    private String custNo;
    //
    private String tourGrp;
    //
    private String tourNo;
    //
    private String guideNo;
    //
    private String custSex;
    //
    private String custId;
    //
    private String custAge;
    //
    private String cfFrom;
    //
    private String cfYs;
    //
    private String cfPyr;
    //
    private String cfFyr;
    //
    private String cfZd;
    //
    private String cfNo;
///////////////////////////////////////////////////////////////
    public String getSheetNo() {
        return this.sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }
    public Date getOperDate() {
        return this.operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }
    public Date getSaleTime() {
        return this.saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }
    public String getPosType() {
        return this.posType;
    }

    public void setPosType(String posType) {
        this.posType = posType;
    }
    public String getPosStatus() {
        return this.posStatus;
    }

    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus;
    }
    public String getDealNo() {
        return this.dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo;
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
    public String getBranchNo() {
        return this.branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }
    public String getCounterNo() {
        return this.counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
    }
    public String getJh() {
        return this.jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }
    public String getLocalNo() {
        return this.localNo;
    }

    public void setLocalNo(String localNo) {
        this.localNo = localNo;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }
    public String getVoucherNo() {
        return this.voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }
    public String getVipNo() {
        return this.vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo;
    }
    public Double getPosOrgAmt() {
        return this.posOrgAmt;
    }

    public void setPosOrgAmt(Double posOrgAmt) {
        this.posOrgAmt = posOrgAmt;
    }
    public Double getPosTotalAmt() {
        return this.posTotalAmt;
    }

    public void setPosTotalAmt(Double posTotalAmt) {
        this.posTotalAmt = posTotalAmt;
    }
    public Double getPosIntegral() {
        return this.posIntegral;
    }

    public void setPosIntegral(Double posIntegral) {
        this.posIntegral = posIntegral;
    }
    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustMan() {
        return this.custMan;
    }

    public void setCustMan(String custMan) {
        this.custMan = custMan;
    }
    public String getCustAddress() {
        return this.custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    public String getCustTel() {
        return this.custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }
    public String getCustRequest() {
        return this.custRequest;
    }

    public void setCustRequest(String custRequest) {
        this.custRequest = custRequest;
    }
    public Date getPosOrderTime() {
        return this.posOrderTime;
    }

    public void setPosOrderTime(Date posOrderTime) {
        this.posOrderTime = posOrderTime;
    }
    public Date getPosSendTime() {
        return this.posSendTime;
    }

    public void setPosSendTime(Date posSendTime) {
        this.posSendTime = posSendTime;
    }
    public String getDealOrder() {
        return this.dealOrder;
    }

    public void setDealOrder(String dealOrder) {
        this.dealOrder = dealOrder;
    }
    public String getPosMemo() {
        return this.posMemo;
    }

    public void setPosMemo(String posMemo) {
        this.posMemo = posMemo;
    }
    public String getPosBytxt1() {
        return this.posBytxt1;
    }

    public void setPosBytxt1(String posBytxt1) {
        this.posBytxt1 = posBytxt1;
    }
    public String getPosBytxt2() {
        return this.posBytxt2;
    }

    public void setPosBytxt2(String posBytxt2) {
        this.posBytxt2 = posBytxt2;
    }
    public String getPosBytxt3() {
        return this.posBytxt3;
    }

    public void setPosBytxt3(String posBytxt3) {
        this.posBytxt3 = posBytxt3;
    }
    public Long getFuTimes() {
        return this.fuTimes;
    }

    public void setFuTimes(Long fuTimes) {
        this.fuTimes = fuTimes;
    }
    public String getPosOrderIsSend() {
        return this.posOrderIsSend;
    }

    public void setPosOrderIsSend(String posOrderIsSend) {
        this.posOrderIsSend = posOrderIsSend;
    }
    public String getPosOrderStatus() {
        return this.posOrderStatus;
    }

    public void setPosOrderStatus(String posOrderStatus) {
        this.posOrderStatus = posOrderStatus;
    }
    public String getPosOrderSender() {
        return this.posOrderSender;
    }

    public void setPosOrderSender(String posOrderSender) {
        this.posOrderSender = posOrderSender;
    }
    public String getCustNo() {
        return this.custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
    public String getTourGrp() {
        return this.tourGrp;
    }

    public void setTourGrp(String tourGrp) {
        this.tourGrp = tourGrp;
    }
    public String getTourNo() {
        return this.tourNo;
    }

    public void setTourNo(String tourNo) {
        this.tourNo = tourNo;
    }
    public String getGuideNo() {
        return this.guideNo;
    }

    public void setGuideNo(String guideNo) {
        this.guideNo = guideNo;
    }
    public String getCustSex() {
        return this.custSex;
    }

    public void setCustSex(String custSex) {
        this.custSex = custSex;
    }
    public String getCustId() {
        return this.custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }
    public String getCustAge() {
        return this.custAge;
    }

    public void setCustAge(String custAge) {
        this.custAge = custAge;
    }
    public String getCfFrom() {
        return this.cfFrom;
    }

    public void setCfFrom(String cfFrom) {
        this.cfFrom = cfFrom;
    }
    public String getCfYs() {
        return this.cfYs;
    }

    public void setCfYs(String cfYs) {
        this.cfYs = cfYs;
    }
    public String getCfPyr() {
        return this.cfPyr;
    }

    public void setCfPyr(String cfPyr) {
        this.cfPyr = cfPyr;
    }
    public String getCfFyr() {
        return this.cfFyr;
    }

    public void setCfFyr(String cfFyr) {
        this.cfFyr = cfFyr;
    }
    public String getCfZd() {
        return this.cfZd;
    }

    public void setCfZd(String cfZd) {
        this.cfZd = cfZd;
    }
    public String getCfNo() {
        return this.cfNo;
    }

    public void setCfNo(String cfNo) {
        this.cfNo = cfNo;
    }

}