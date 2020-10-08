package com.shuyuan.judd.client.model.request;

import com.shuyuan.judd.client.model.merchant.MerchantBank;
import com.shuyuan.judd.client.model.merchant.MerchantChannel;
import com.shuyuan.judd.client.model.merchant.Merchant;
import lombok.Data;

/**
 * @author Sting
 * create 2019/01/14
 * 子商户绑卡下单请求对象
 **/
@Data
public class MerchantBindCardOrderRequest {
    //短信验证码
    private String messageCode;
    //订单号
    private String orderNo;

    //渠道返回的订单号，确认绑卡时需要
    private String tradeNo;

    private Merchant merchant;
    private MerchantBank merchantBank;
    private String channelMerchantNo;

}
