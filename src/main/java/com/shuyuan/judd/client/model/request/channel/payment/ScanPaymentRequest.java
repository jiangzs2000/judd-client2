package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class ScanPaymentRequest extends PaymentRequest{
    /**
     *支付方式, 取值范围：
     * WECHAT： 微信扫码支付
     * ALIPAY： 支付宝扫码支付
     */
    private String payType;
    /**
     * 二维码有效期,单位:秒
     * 当传递小于 300 秒或大于 1800 分钟或不传递时系统默认为
     * 300 秒，订单有效时间从调起用户密码键盘开始算起，超时
     * 之后,用户无法继续支付。
     */
    private String expireTime;
}
