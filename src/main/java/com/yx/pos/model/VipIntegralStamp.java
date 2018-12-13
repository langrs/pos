package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class VipIntegralStamp extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private Double needIntegral;
    //
    private Double stampAmt;
    //
    private Long stampQty;
    //
    private String giveMemo;
///////////////////////////////////////////////////////////////
    public Double getNeedIntegral() {
        return this.needIntegral;
    }

    public void setNeedIntegral(Double needIntegral) {
        this.needIntegral = needIntegral;
    }
    public Double getStampAmt() {
        return this.stampAmt;
    }

    public void setStampAmt(Double stampAmt) {
        this.stampAmt = stampAmt;
    }
    public Long getStampQty() {
        return this.stampQty;
    }

    public void setStampQty(Long stampQty) {
        this.stampQty = stampQty;
    }
    public String getGiveMemo() {
        return this.giveMemo;
    }

    public void setGiveMemo(String giveMemo) {
        this.giveMemo = giveMemo;
    }

}