package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class EntrustPayEngageConfirmRequest {
    /**
     *
     */
    private String version = "1.0";
    /**
     *三方渠道返回的订单号
     */
    private String tradeNo;
    /**
     *短信验证
     */
    private String verifyCode;
}
