package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class CounterInfo extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String counterNo;
    //
    private String counterName;
    //
    private String countypeNo;
    //
    private String counterMan;
    //
    private String counterAddress;
    //
    private String counterTel;
    //
    private Double counterArea;
    //
    private String outsideFlag;
    //
    private String displayFlag;
    //
    private String counterMemo;
    //
    private String isSysFlag;
    //
    private String showboxNo;
///////////////////////////////////////////////////////////////
    public String getCounterNo() {
        return this.counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
    }
    public String getCounterName() {
        return this.counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }
    public String getCountypeNo() {
        return this.countypeNo;
    }

    public void setCountypeNo(String countypeNo) {
        this.countypeNo = countypeNo;
    }
    public String getCounterMan() {
        return this.counterMan;
    }

    public void setCounterMan(String counterMan) {
        this.counterMan = counterMan;
    }
    public String getCounterAddress() {
        return this.counterAddress;
    }

    public void setCounterAddress(String counterAddress) {
        this.counterAddress = counterAddress;
    }
    public String getCounterTel() {
        return this.counterTel;
    }

    public void setCounterTel(String counterTel) {
        this.counterTel = counterTel;
    }
    public Double getCounterArea() {
        return this.counterArea;
    }

    public void setCounterArea(Double counterArea) {
        this.counterArea = counterArea;
    }
    public String getOutsideFlag() {
        return this.outsideFlag;
    }

    public void setOutsideFlag(String outsideFlag) {
        this.outsideFlag = outsideFlag;
    }
    public String getDisplayFlag() {
        return this.displayFlag;
    }

    public void setDisplayFlag(String displayFlag) {
        this.displayFlag = displayFlag;
    }
    public String getCounterMemo() {
        return this.counterMemo;
    }

    public void setCounterMemo(String counterMemo) {
        this.counterMemo = counterMemo;
    }
    public String getIsSysFlag() {
        return this.isSysFlag;
    }

    public void setIsSysFlag(String isSysFlag) {
        this.isSysFlag = isSysFlag;
    }
    public String getShowboxNo() {
        return this.showboxNo;
    }

    public void setShowboxNo(String showboxNo) {
        this.showboxNo = showboxNo;
    }

}