package com.shuyuan.judd.client.model.trade.vo;

import lombok.Data;

/**
 * @author Sting
 * create 2018/08/01

 * saas微信下单返回数据封装
 **/
@Data
public class SaasWxPayOrderResVO {
    //公众号id
    private String appId;
    //时间戳
    private String timeStamp;
    //随机字符串
    private String nonceStr;
    //订单详情扩展字符串(package)
    private String package_info;
    //签名方式
    private String signType;
    //签名
    private String paySign;

    //商户交易订单号
    private String orderId;
    //第三方交易流水号
    private String tradeNo;
    //微信app支付唤起支付所需
    //金额
    private String amount;
    //商户号
    private String merId;
    //进件生成的Id
    private String merCustId;

    //支付宝公众号跳转支付链接
    private String paymentLink;

    @Override
    public String toString() {
        return "SaasWxPayOrderResVO{" +
                "appId='" + appId + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", package_info='" + package_info + '\'' +
                ", signType='" + signType + '\'' +
                ", paySign='" + paySign + '\'' +
                '}';
    }
}
