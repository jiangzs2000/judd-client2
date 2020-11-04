package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ChannelRegistrationApplication {
    private String OrderNo;
    private String notifyUrl;
    private String channelCode;
    private String merchantName;
    private Integer merchantType;
    private String merchantNo;
    /**
     * 社会主体编号，如果是个人，该字段为身份证号，如果是个体户和企业，该字段为营业执照号
     */
    private String socialEntityNo;
    private String channelMerchantNo;
    private Long merchantBankId;
    private String pAgreementId;
    private String reviewUser;
    private String reviewRemark;
    private Integer state;
    private Long createUser;
    private Timestamp createTime;
    private Long updateUser;
    private Timestamp updateTime;
    private Integer status;
}
