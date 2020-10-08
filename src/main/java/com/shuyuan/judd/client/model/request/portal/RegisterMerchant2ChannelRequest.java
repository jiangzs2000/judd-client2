package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.Merchant;
import com.shuyuan.judd.client.model.merchant.MerchantBank;
import com.shuyuan.judd.client.model.merchant.PaySalesAgreement;
import lombok.Data;

/**
 * 向通道端发送个人商户注册请求
 */
@Data
public class RegisterMerchant2ChannelRequest {
    /**
     * 请求的订单编号
     */
    private String orderNo;
    private String channelCode;
    private Merchant merchant;
    private MerchantBank merchantBank;
    private PaySalesAgreement paySalesAgreement;

}
