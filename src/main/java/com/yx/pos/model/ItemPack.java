package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class ItemPack extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String masterNo;
    //
    private String itemNo;
    //
    private String packType;
    //
    private Double packQty;
    //
    private Double saleAmt;
    //
    private Double vipAmt;
    //
    private String memo;
    //
    private Long packXh;
///////////////////////////////////////////////////////////////
    public String getMasterNo() {
        return this.masterNo;
    }

    public void setMasterNo(String masterNo) {
        this.masterNo = masterNo;
    }
    public String getItemNo() {
        return this.itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    public String getPackType() {
        return this.packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }
    public Double getPackQty() {
        return this.packQty;
    }

    public void setPackQty(Double packQty) {
        this.packQty = packQty;
    }
    public Double getSaleAmt() {
        return this.saleAmt;
    }

    public void setSaleAmt(Double saleAmt) {
        this.saleAmt = saleAmt;
    }
    public Double getVipAmt() {
        return this.vipAmt;
    }

    public void setVipAmt(Double vipAmt) {
        this.vipAmt = vipAmt;
    }
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Long getPackXh() {
        return this.packXh;
    }

    public void setPackXh(Long packXh) {
        this.packXh = packXh;
    }

}