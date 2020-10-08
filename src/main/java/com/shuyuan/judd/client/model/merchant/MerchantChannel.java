package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class MerchantChannel {
    private Long id;
    private String merchantNo;
    private String channelCode;
    private String channelMerchantNo;
    private Long merchantBankId;
    private String pAgreementId;
    private Integer available;
    private Integer status;
    private Long createUser;
    private Timestamp createTime;
    private Long updateUser;
    private Timestamp updateTime;

}
