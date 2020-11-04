package com.shuyuan.judd.client.model.request.portal;

import lombok.Data;

/**
 * 向通道端发送个人商户注册请求
 */
@Data
public class RegisterMerchantRequest extends ChannelProvisionRequest {

    /**
     * 操作 save, submit4review
     */
    private String action;

}
