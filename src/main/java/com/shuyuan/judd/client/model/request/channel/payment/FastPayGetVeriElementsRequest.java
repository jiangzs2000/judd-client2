package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class FastPayGetVeriElementsRequest extends PaymentRequest {

    /**
     * 支付客户的平台编号
     */
    private String merCustId;
    /**
     * 银行卡类型, 取 值 范 围 ： CREDITCARD（信用卡）
     * DEBITCARD（借记卡）
     */
    private String cardType;
    /**
     * 银行编号, 银行卡的发卡行，详见银行列表
     */
    private String bankCode;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 支付协议号, 客户首次银行卡快捷支付成功后链金平台返回的支付协议编号（补充支付验证要素后会更新），子商户
     * 绑卡认证通过后返回的支付协议号
     */
    private String pAgreementId;
    /**
     * 验证的手机号
     */
    private String mobileNo;
}
