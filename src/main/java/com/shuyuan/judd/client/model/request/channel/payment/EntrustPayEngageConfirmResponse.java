package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class EntrustPayEngageConfirmResponse {
    /**
     *支付协议号, 当返回码为 0000 时，返回支付协议
     * 号
     */
    private String pAgreementId;
    /**
     *银行编号
     */
    private String bankCode;
    /**
     *卡号后四位
     */
    private String lastFourCardid;
}
