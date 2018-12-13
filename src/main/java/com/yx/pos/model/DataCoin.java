package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class DataCoin extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String coinNo;
    //
    private String coinName;
    //
    private Double coinRate;
    //
    private String isSysFlag;
    //
    private String coinCode;
///////////////////////////////////////////////////////////////
    public String getCoinNo() {
        return this.coinNo;
    }

    public void setCoinNo(String coinNo) {
        this.coinNo = coinNo;
    }
    public String getCoinName() {
        return this.coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
    public Double getCoinRate() {
        return this.coinRate;
    }

    public void setCoinRate(Double coinRate) {
        this.coinRate = coinRate;
    }
    public String getIsSysFlag() {
        return this.isSysFlag;
    }

    public void setIsSysFlag(String isSysFlag) {
        this.isSysFlag = isSysFlag;
    }
    public String getCoinCode() {
        return this.coinCode;
    }

    public void setCoinCode(String coinCode) {
        this.coinCode = coinCode;
    }

}