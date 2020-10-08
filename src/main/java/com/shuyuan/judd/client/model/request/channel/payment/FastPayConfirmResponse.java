package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class FastPayConfirmResponse extends PaymentResponse {
    /**
     * 支付协议号, 用户注册标准快捷服务后，并选择某个银行卡首次支付成功时，平台会为该用户的此银行卡注册支付协议，并生成此协议号。
     * 该值不为空时表明是首次支付，并且关联银行卡成功。可根据该值来
     * 判断是否关联成功。
     */
    private String pAgreementId;
    /**
     * 支付使用的银行编码
     */
    private String bankCode;
    /**
     * 支付成功后的银行卡号后四位
     */
    private String lastFourCardid;
}
