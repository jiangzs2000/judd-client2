package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class PaymentRequest {
    /**
     * 交易成功后，会按照此地址将交易结果以后台的方式发送到商户平 台；
     */
    private String notifyUrl;
    /**
     * 商户支付流水号，商户平台生成的标识该笔支付交易
     * 的流水号，该流水号在商户平台中必须唯一，流水号类型为字符串
     */
    private String trace;
    /**
     * 三方平台创建订单后返回的平台业务订单流水号
     */
    private String tradeNo;
    /**
     * 金额,分
     */
    private Long amount;
    /**
     * 备注信息
     */
    private String remark;
}
