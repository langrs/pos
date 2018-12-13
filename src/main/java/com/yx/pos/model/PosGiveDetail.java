package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class PosGiveDetail extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String sheetNo;
    //
    private Double sheetSn;
    //
    private String itemRange;
    //
    private String itemNo;
    //
    private String barcode;
    //
    private String useStatus;
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
    public String getItemRange() {
        return this.itemRange;
    }

    public void setItemRange(String itemRange) {
        this.itemRange = itemRange;
    }
    public String getItemNo() {
        return this.itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public String getUseStatus() {
        return this.useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
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

}