package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class DataPayment extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String paymentNo;
    //
    private String paymentName;
    //
    private String paymentIsPos;
    //
    private String paymentIsHt;
    //
    private String paymentIsZero;
    //
    private String paymentIsMore;
    //
    private String paymentIsCash;
    //
    private String coinNo;
    //
    private String visaNo;
    //
    private String posShortcutSys;
    //
    private String posShortcutUser;
    //
    private String paymentMemo;
    //
    private String isSysFlag;
    //
    private String createUser;
    //
    private String modifyUser;
    //
    private String paymentIsSn;
    //
    private String paymentIsMemo;
    //
    private String paymentIsTax;
    //
    private Long touchIndex;
    //
    private Double chargeRate;
    //
    private Double chargeMaxAmt;
    //
    private String paymentIsReal;
///////////////////////////////////////////////////////////////
    public String getPaymentNo() {
        return this.paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }
    public String getPaymentName() {
        return this.paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }
    public String getPaymentIsPos() {
        return this.paymentIsPos;
    }

    public void setPaymentIsPos(String paymentIsPos) {
        this.paymentIsPos = paymentIsPos;
    }
    public String getPaymentIsHt() {
        return this.paymentIsHt;
    }

    public void setPaymentIsHt(String paymentIsHt) {
        this.paymentIsHt = paymentIsHt;
    }
    public String getPaymentIsZero() {
        return this.paymentIsZero;
    }

    public void setPaymentIsZero(String paymentIsZero) {
        this.paymentIsZero = paymentIsZero;
    }
    public String getPaymentIsMore() {
        return this.paymentIsMore;
    }

    public void setPaymentIsMore(String paymentIsMore) {
        this.paymentIsMore = paymentIsMore;
    }
    public String getPaymentIsCash() {
        return this.paymentIsCash;
    }

    public void setPaymentIsCash(String paymentIsCash) {
        this.paymentIsCash = paymentIsCash;
    }
    public String getCoinNo() {
        return this.coinNo;
    }

    public void setCoinNo(String coinNo) {
        this.coinNo = coinNo;
    }
    public String getVisaNo() {
        return this.visaNo;
    }

    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }
    public String getPosShortcutSys() {
        return this.posShortcutSys;
    }

    public void setPosShortcutSys(String posShortcutSys) {
        this.posShortcutSys = posShortcutSys;
    }
    public String getPosShortcutUser() {
        return this.posShortcutUser;
    }

    public void setPosShortcutUser(String posShortcutUser) {
        this.posShortcutUser = posShortcutUser;
    }
    public String getPaymentMemo() {
        return this.paymentMemo;
    }

    public void setPaymentMemo(String paymentMemo) {
        this.paymentMemo = paymentMemo;
    }
    public String getIsSysFlag() {
        return this.isSysFlag;
    }

    public void setIsSysFlag(String isSysFlag) {
        this.isSysFlag = isSysFlag;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
    public String getModifyUser() {
        return this.modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
    public String getPaymentIsSn() {
        return this.paymentIsSn;
    }

    public void setPaymentIsSn(String paymentIsSn) {
        this.paymentIsSn = paymentIsSn;
    }
    public String getPaymentIsMemo() {
        return this.paymentIsMemo;
    }

    public void setPaymentIsMemo(String paymentIsMemo) {
        this.paymentIsMemo = paymentIsMemo;
    }
    public String getPaymentIsTax() {
        return this.paymentIsTax;
    }

    public void setPaymentIsTax(String paymentIsTax) {
        this.paymentIsTax = paymentIsTax;
    }
    public Long getTouchIndex() {
        return this.touchIndex;
    }

    public void setTouchIndex(Long touchIndex) {
        this.touchIndex = touchIndex;
    }
    public Double getChargeRate() {
        return this.chargeRate;
    }

    public void setChargeRate(Double chargeRate) {
        this.chargeRate = chargeRate;
    }
    public Double getChargeMaxAmt() {
        return this.chargeMaxAmt;
    }

    public void setChargeMaxAmt(Double chargeMaxAmt) {
        this.chargeMaxAmt = chargeMaxAmt;
    }
    public String getPaymentIsReal() {
        return this.paymentIsReal;
    }

    public void setPaymentIsReal(String paymentIsReal) {
        this.paymentIsReal = paymentIsReal;
    }

}