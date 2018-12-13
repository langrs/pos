package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class CgSpecPriceDetail extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String sheetNo;
    //
    private Double sheetSn;
    //
    private String itemNo;
    //
    private Double orgPriceValue;
    //
    private Double newPriceValue;
    //
    private String mxMemo;
    //
    private String mxBytxt1;
    //
    private String mxBytxt2;
    //
    private String mxBytxt3;
    //
    private Double mxBynum1;
    //
    private Double mxBynum2;
    //
    private Double mxBynum3;
    //
    private Long unitType;
    //
    private String barcode;
    //
    private String nowUnit;
    //
    private Double nowPack;
    //
    private Double nowQty;
    //
    private Double subQty;
///////////////////////////////////////////////////////////////
    public String getSheetNo() {
        return this.sheetNo;
    }

    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }
    public Double getSheetSn() {
        return this.sheetSn;
    }

    public void setSheetSn(Double sheetSn) {
        this.sheetSn = sheetSn;
    }
    public String getItemNo() {
        return this.itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    public Double getOrgPriceValue() {
        return this.orgPriceValue;
    }

    public void setOrgPriceValue(Double orgPriceValue) {
        this.orgPriceValue = orgPriceValue;
    }
    public Double getNewPriceValue() {
        return this.newPriceValue;
    }

    public void setNewPriceValue(Double newPriceValue) {
        this.newPriceValue = newPriceValue;
    }
    public String getMxMemo() {
        return this.mxMemo;
    }

    public void setMxMemo(String mxMemo) {
        this.mxMemo = mxMemo;
    }
    public String getMxBytxt1() {
        return this.mxBytxt1;
    }

    public void setMxBytxt1(String mxBytxt1) {
        this.mxBytxt1 = mxBytxt1;
    }
    public String getMxBytxt2() {
        return this.mxBytxt2;
    }

    public void setMxBytxt2(String mxBytxt2) {
        this.mxBytxt2 = mxBytxt2;
    }
    public String getMxBytxt3() {
        return this.mxBytxt3;
    }

    public void setMxBytxt3(String mxBytxt3) {
        this.mxBytxt3 = mxBytxt3;
    }
    public Double getMxBynum1() {
        return this.mxBynum1;
    }

    public void setMxBynum1(Double mxBynum1) {
        this.mxBynum1 = mxBynum1;
    }
    public Double getMxBynum2() {
        return this.mxBynum2;
    }

    public void setMxBynum2(Double mxBynum2) {
        this.mxBynum2 = mxBynum2;
    }
    public Double getMxBynum3() {
        return this.mxBynum3;
    }

    public void setMxBynum3(Double mxBynum3) {
        this.mxBynum3 = mxBynum3;
    }
    public Long getUnitType() {
        return this.unitType;
    }

    public void setUnitType(Long unitType) {
        this.unitType = unitType;
    }
    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public String getNowUnit() {
        return this.nowUnit;
    }

    public void setNowUnit(String nowUnit) {
        this.nowUnit = nowUnit;
    }
    public Double getNowPack() {
        return this.nowPack;
    }

    public void setNowPack(Double nowPack) {
        this.nowPack = nowPack;
    }
    public Double getNowQty() {
        return this.nowQty;
    }

    public void setNowQty(Double nowQty) {
        this.nowQty = nowQty;
    }
    public Double getSubQty() {
        return this.subQty;
    }

    public void setSubQty(Double subQty) {
        this.subQty = subQty;
    }

}