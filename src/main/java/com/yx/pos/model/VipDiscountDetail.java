package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class VipDiscountDetail extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String discountNo;
    //
    private Long discountSn;
    //
    private String discountClass;
    //
    private Double discountRate;
///////////////////////////////////////////////////////////////
    public String getDiscountNo() {
        return this.discountNo;
    }

    public void setDiscountNo(String discountNo) {
        this.discountNo = discountNo;
    }
    public Long getDiscountSn() {
        return this.discountSn;
    }

    public void setDiscountSn(Long discountSn) {
        this.discountSn = discountSn;
    }
    public String getDiscountClass() {
        return this.discountClass;
    }

    public void setDiscountClass(String discountClass) {
        this.discountClass = discountClass;
    }
    public Double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

}