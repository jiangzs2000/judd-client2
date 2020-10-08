package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class MemberWithdrawOrderRequest {
    private String orderNo;
    private String date;
    private String merchantNo;
    private String merchantType;
    private String pAgreementId;
    private Long amount;
    private String remark;
}
