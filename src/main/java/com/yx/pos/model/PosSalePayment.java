package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosSalePayment extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String sheetNo;
    //
    private Long sheetSort;
    //
    private String paymentNo;
    //
    private Double paymentAmt;
    //
    private String isOrder;
    //
    private String coinNo;
    //
    private Double coinRate;
    //
    private String vipNo;
    //
    private String cardNo;
    //
    private String bankType;
    //
    private String bankNo;
    //
    private String otherNo;
    //
    private String paymentMemo;
    //
    private Double parAmt;
///////////////////////////////////////////////////////////////
    public String getSheetNo() {
        return this.sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }
    public Long getSheetSort() {
        return this.sheetSort;
    }

    public void setSheetSort(Long sheetSort) {
        this.sheetSort = sheetSort;
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
    public String getIsOrder() {
        return this.isOrder;
    }

    public void setIsOrder(String isOrder) {
        this.isOrder = isOrder;
    }
    public String getCoinNo() {
        return this.coinNo;
    }

    public void setCoinNo(String coinNo) {
        this.coinNo = coinNo;
    }
    public Double getCoinRate() {
        return this.coinRate;
    }

    public void setCoinRate(Double coinRate) {
        this.coinRate = coinRate;
    }
    public String getVipNo() {
        return this.vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    public String getBankType() {
        return this.bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }
    public String getOtherNo() {
        return this.otherNo;
    }

    public void setOtherNo(String otherNo) {
        this.otherNo = otherNo;
    }
    public String getPaymentMemo() {
        return this.paymentMemo;
    }

    public void setPaymentMemo(String paymentMemo) {
        this.paymentMemo = paymentMemo;
    }
    public Double getParAmt() {
        return this.parAmt;
    }

    public void setParAmt(Double parAmt) {
        this.parAmt = parAmt;
    }

}