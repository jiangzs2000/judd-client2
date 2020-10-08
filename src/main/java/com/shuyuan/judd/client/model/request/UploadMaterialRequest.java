package com.shuyuan.judd.client.model.request;

import com.shuyuan.judd.client.model.merchant.Merchant;
import lombok.Data;

@Data
public class UploadMaterialRequest {
    private Merchant merchant;
    private String channelMerchantNo;
}
