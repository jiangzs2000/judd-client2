package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class FastPayGetVeriElementsResponse extends PaymentResponse {
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
     *支付验证要素,客户支付时须填写的支付验证要素列表，
     * 此字段包含的所有标签都需要在下发短信验证码和支付确认接口中传递
     * （若是非首次支付后返回非空，则表示需要额外补充支付验证要素）
     */
    private String payElements;
}
