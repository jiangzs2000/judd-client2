package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class FastPayConfirmRequest extends PaymentRequest {
    /**
     * 银行预留手机号, 持卡人在银行开立该卡时在银行登
     * 记的手机号
     */
    private String mobileNo;
    /**
     * 短信验证码， 银行给持卡人预留手机号发送的支
     * 付确认的短信验证码
     */
    private String verifyCode;
    /**
     *卡号
     */
    private String cardNo;
    /**
     *持卡人姓名
     */
    private String cardHolder;
    /**
     *证件类型 ， 固定为：1（身份证）
     */
    private String idType = "1";
    /**
     *证件号
     */
    private String idNo;
    /**
     *信用卡有效期YYMM）
     */
    private String validDate;
    /**
     *信用卡CVN2/CVV2,
     */
    private String cvv2;
    /**
     *支付协议号, 客户非首次支付、子商户支付时必填
     */
    private String pAgreementId;
}
