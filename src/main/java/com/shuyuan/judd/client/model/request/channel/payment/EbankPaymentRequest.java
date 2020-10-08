package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class EbankPaymentRequest extends PaymentRequest {
    /**
     * 前台页面返回地址, 客户支付完成后，前台成功返回跳
     * 转的地址
     */
    private String retUrl;
    /**
     * 支付类型，取 值 范 围 ： B2BBANK（B2B 网银） B2CBANK（B2C 网银）
     * B2CDEBITBANK（B2C 个人网银借记卡）
     */
    private String payType;
    /**
     * 银行编号, 银行卡的发卡行，详见银行列表
     */
    private String bankCode;
}
