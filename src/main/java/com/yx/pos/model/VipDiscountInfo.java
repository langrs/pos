package com.yx.pos.model;
import com.yx.pos.base.AbstractModel;


/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
public class VipDiscountInfo extends AbstractModel {

    private static final long serialVersionUID = 1L;

    //
    private String discountNo;
    //
    private String discountName;
    //
    private String discountIsSame;
    //
    private String discountType;
    //
    private Double discountRate;
    //
    private String discountMemo;
    //
    private String isSysFlag;
    //
    private String createUser;
    //
    private String modifyUser;
///////////////////////////////////////////////////////////////
    public String getDiscountNo() {
        return this.discountNo;
    }

    public void setDiscountNo(String discountNo) {
        this.discountNo = discountNo;
    }
    public String getDiscountName() {
        return this.discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }
    public String getDiscountIsSame() {
        return this.discountIsSame;
    }

    public void setDiscountIsSame(String discountIsSame) {
        this.discountIsSame = discountIsSame;
    }
    public String getDiscountType() {
        return this.discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }
    public Double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }
    public String getDiscountMemo() {
        return this.discountMemo;
    }

    public void setDiscountMemo(String discountMemo) {
        this.discountMemo = discountMemo;
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

}