package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.Merchant;
import com.shuyuan.judd.client.model.merchant.MerchantBank;
import com.shuyuan.judd.client.model.merchant.PaySalesAgreement;
import lombok.Data;

@Data
public class ChannelProvisionRequest {
    /**
     * 请求的订单编号
     */
    private String orderNo;
    private Merchant merchant;
    private MerchantBank merchantBank;
    private PaySalesAgreement paySalesAgreement;
}
