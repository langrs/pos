package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class VipIntegralDetail extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String integralNo;
    //
    private Long integralSn;
    //
    private String paymentNo;
    //
    private String itemClass;
    //
    private Double sectAmt;
    //
    private Double integralAmt;
    //
    private String itemProperty;
///////////////////////////////////////////////////////////////
    public String getIntegralNo() {
        return this.integralNo;
    }

    public void setIntegralNo(String integralNo) {
        this.integralNo = integralNo;
    }
    public Long getIntegralSn() {
        return this.integralSn;
    }

    public void setIntegralSn(Long integralSn) {
        this.integralSn = integralSn;
    }
    public String getPaymentNo() {
        return this.paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }
    public String getItemClass() {
        return this.itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }
    public Double getSectAmt() {
        return this.sectAmt;
    }

    public void setSectAmt(Double sectAmt) {
        this.sectAmt = sectAmt;
    }
    public Double getIntegralAmt() {
        return this.integralAmt;
    }

    public void setIntegralAmt(Double integralAmt) {
        this.integralAmt = integralAmt;
    }
    public String getItemProperty() {
        return this.itemProperty;
    }

    public void setItemProperty(String itemProperty) {
        this.itemProperty = itemProperty;
    }

}