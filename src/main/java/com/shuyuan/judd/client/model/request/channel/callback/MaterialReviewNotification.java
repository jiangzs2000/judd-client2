package com.shuyuan.judd.client.model.request.channel.callback;

import lombok.Data;

@Data
public class MaterialReviewNotification {
    private String channelMerchantNo;
    private String channelCode;
    private String reviewState;
    private String reviewUser;
    private String reviewRemark;

    public static final String REVIEW_STATE_PASS = "2";
    public static final String REVIEW_STATE_DENIED = "3";
}
