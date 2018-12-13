package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosDealDetail extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String dealNo;
    //
    private Long dealSn;
    //
    private String paymentType;
    //
    private String paymentNo;
    //
    private Double paymentAmt;
    //
    private Double coinRate;
    //
    private String memo;
///////////////////////////////////////////////////////////////
    public String getDealNo() {
        return this.dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo;
    }
    public Long getDealSn() {
        return this.dealSn;
    }

    public void setDealSn(Long dealSn) {
        this.dealSn = dealSn;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getPaymentNo() {
        return this.paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }
    public Double getPaymentAmt() {
        return this.paymentAmt;
    }

    public void setPaymentAmt(Double paymentAmt) {
        this.paymentAmt = paymentAmt;
    }
    public Double getCoinRate() {
        return this.coinRate;
    }

    public void setCoinRate(Double coinRate) {
        this.coinRate = coinRate;
    }
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}