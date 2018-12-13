package com.yx.pos.model;

import com.yx.pos.base.AbstractModel;

import java.util.Date;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosSaleDetail extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String sheetNo;
    //
    private Long sheetSort;
    //
    private String itemNo;
    //
    private String saleBarcode;
    //
    private String itemUnit;
    //
    private Long unitType;
    //
    private Double unitPack;
    //
    private Double orgPrice;
    //
    private Double realPrice;
    //
    private Double saleQty;
    //
    private Long saleSign;
    //
    private Double saleAmt;
    //
    private String saleMan;
    //
    private String counterNo;
    //
    private String manageType;
    //
    private String specialType;
    //
    private String specialNo;
    //
    private String itemIspack;
    //
    private Double jsQty;
    //
    private String saleMemo;
    //
    private String saleBytxt1;
    //
    private String saleBytxt2;
    //
    private String saleBytxt3;
    //
    private Double saleBynum1;
    //
    private Double saleBynum2;
    //
    private Double saleBynum3;
    //
    private Double allzkForeRealPrice;
    //
    private String allzkForeSpecialType;
    //
    private Double manageLyRate;
    //
    private String lySupNo;
    //
    private Double insideTaxAmt;
    //
    private String isPackage;
    //
    private String limitBranch;
    //
    private String limitTimes;
    //
    private String limitDate;
    //
    private Date validBegin;
    //
    private Date validEnd;
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
    public String getItemNo() {
        return this.itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    public String getSaleBarcode() {
        return this.saleBarcode;
    }

    public void setSaleBarcode(String saleBarcode) {
        this.saleBarcode = saleBarcode;
    }
    public String getItemUnit() {
        return this.itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }
    public Long getUnitType() {
        return this.unitType;
    }

    public void setUnitType(Long unitType) {
        this.unitType = unitType;
    }
    public Double getUnitPack() {
        return this.unitPack;
    }

    public void setUnitPack(Double unitPack) {
        this.unitPack = unitPack;
    }
    public Double getOrgPrice() {
        return this.orgPrice;
    }

    public void setOrgPrice(Double orgPrice) {
        this.orgPrice = orgPrice;
    }
    public Double getRealPrice() {
        return this.realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }
    public Double getSaleQty() {
        return this.saleQty;
    }

    public void setSaleQty(Double saleQty) {
        this.saleQty = saleQty;
    }
    public Long getSaleSign() {
        return this.saleSign;
    }

    public void setSaleSign(Long saleSign) {
        this.saleSign = saleSign;
    }
    public Double getSaleAmt() {
        return this.saleAmt;
    }

    public void setSaleAmt(Double saleAmt) {
        this.saleAmt = saleAmt;
    }
    public String getSaleMan() {
        return this.saleMan;
    }

    public void setSaleMan(String saleMan) {
        this.saleMan = saleMan;
    }
    public String getCounterNo() {
        return this.counterNo;
    }

    public void setCounterNo(String counterNo) {
        this.counterNo = counterNo;
    }
    public String getManageType() {
        return this.manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }
    public String getSpecialType() {
        return this.specialType;
    }

    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }
    public String getSpecialNo() {
        return this.specialNo;
    }

    public void setSpecialNo(String specialNo) {
        this.specialNo = specialNo;
    }
    public String getItemIspack() {
        return this.itemIspack;
    }

    public void setItemIspack(String itemIspack) {
        this.itemIspack = itemIspack;
    }
    public Double getJsQty() {
        return this.jsQty;
    }

    public void setJsQty(Double jsQty) {
        this.jsQty = jsQty;
    }
    public String getSaleMemo() {
        return this.saleMemo;
    }

    public void setSaleMemo(String saleMemo) {
        this.saleMemo = saleMemo;
    }
    public String getSaleBytxt1() {
        return this.saleBytxt1;
    }

    public void setSaleBytxt1(String saleBytxt1) {
        this.saleBytxt1 = saleBytxt1;
    }
    public String getSaleBytxt2() {
        return this.saleBytxt2;
    }

    public void setSaleBytxt2(String saleBytxt2) {
        this.saleBytxt2 = saleBytxt2;
    }
    public String getSaleBytxt3() {
        return this.saleBytxt3;
    }

    public void setSaleBytxt3(String saleBytxt3) {
        this.saleBytxt3 = saleBytxt3;
    }
    public Double getSaleBynum1() {
        return this.saleBynum1;
    }

    public void setSaleBynum1(Double saleBynum1) {
        this.saleBynum1 = saleBynum1;
    }
    public Double getSaleBynum2() {
        return this.saleBynum2;
    }

    public void setSaleBynum2(Double saleBynum2) {
        this.saleBynum2 = saleBynum2;
    }
    public Double getSaleBynum3() {
        return this.saleBynum3;
    }

    public void setSaleBynum3(Double saleBynum3) {
        this.saleBynum3 = saleBynum3;
    }
    public Double getAllzkForeRealPrice() {
        return this.allzkForeRealPrice;
    }

    public void setAllzkForeRealPrice(Double allzkForeRealPrice) {
        this.allzkForeRealPrice = allzkForeRealPrice;
    }
    public String getAllzkForeSpecialType() {
        return this.allzkForeSpecialType;
    }

    public void setAllzkForeSpecialType(String allzkForeSpecialType) {
        this.allzkForeSpecialType = allzkForeSpecialType;
    }
    public Double getManageLyRate() {
        return this.manageLyRate;
    }

    public void setManageLyRate(Double manageLyRate) {
        this.manageLyRate = manageLyRate;
    }
    public String getLySupNo() {
        return this.lySupNo;
    }

    public void setLySupNo(String lySupNo) {
        this.lySupNo = lySupNo;
    }
    public Double getInsideTaxAmt() {
        return this.insideTaxAmt;
    }

    public void setInsideTaxAmt(Double insideTaxAmt) {
        this.insideTaxAmt = insideTaxAmt;
    }
    public String getIsPackage() {
        return this.isPackage;
    }

    public void setIsPackage(String isPackage) {
        this.isPackage = isPackage;
    }
    public String getLimitBranch() {
        return this.limitBranch;
    }

    public void setLimitBranch(String limitBranch) {
        this.limitBranch = limitBranch;
    }
    public String getLimitTimes() {
        return this.limitTimes;
    }

    public void setLimitTimes(String limitTimes) {
        this.limitTimes = limitTimes;
    }
    public String getLimitDate() {
        return this.limitDate;
    }

    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate;
    }
    public Date getValidBegin() {
        return this.validBegin;
    }

    public void setValidBegin(Date validBegin) {
        this.validBegin = validBegin;
    }
    public Date getValidEnd() {
        return this.validEnd;
    }

    public void setValidEnd(Date validEnd) {
        this.validEnd = validEnd;
    }

}