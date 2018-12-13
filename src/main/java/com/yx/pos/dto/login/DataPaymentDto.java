package com.yx.pos.dto.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "DataPaymentDto",description = "支付方式信息")
public class DataPaymentDto implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "支付方式编号")
    private String paymentNo;
    @ApiModelProperty(value = "支付方式名称")
    private String paymentName;
    @ApiModelProperty(value = "是否前台使用")
    private String paymentIsPos;
    @ApiModelProperty(value = "是否找零")
    private String paymentIsZero;
    @ApiModelProperty(value = "是否允许超额")
    private String paymentIsMore;
    @ApiModelProperty(value = "是否为现金")
    private String paymentIsCash;
    @ApiModelProperty(value = "币种")
    private String coinNo;
    @ApiModelProperty(value = "资金账户")
    private String visaNo;
    @ApiModelProperty(value = "支付备注")
    private String paymentMemo;
    @ApiModelProperty(value = "是否录入编号")
     private String paymentIsSn;
    @ApiModelProperty(value = "是否录入备注")
    private String paymentIsMemo;
    @ApiModelProperty(value = "是否加税")
    private String paymentIsTax;


}
