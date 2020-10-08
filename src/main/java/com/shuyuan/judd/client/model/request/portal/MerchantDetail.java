package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.Merchant;
import com.shuyuan.judd.client.model.merchant.MerchantBank;
import com.shuyuan.judd.client.model.merchant.PaySalesAgreement;
import lombok.Data;

@Data
public class MerchantDetail {
    private Merchant merchant;
    private PaySalesAgreement psa;
    private MerchantBank mb;
}
