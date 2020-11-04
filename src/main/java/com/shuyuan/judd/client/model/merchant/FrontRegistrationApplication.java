package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class FrontRegistrationApplication {
    private String OrderNo;
    private String notifyUrl;
    private String merchantName;
    private Integer merchantType;
    private String merchantNo;
    private Long merchantBankId;
    private Long reviewUser;
    private String reviewRemark;
    private Long paySalesAgreementId;
    private String state;
    private Long createUser;
    private Timestamp createTime;
    private Long updateUser;
    private Timestamp updateTime;
    private Integer status;
    public static class State {
        public static final String INIT = "I";
        public static final String WAIT_FOR_REVIEW = "W";
        public static final String PASS_REVIEW = "P";
        public static final String FAIL_REVIEW = "F";

    }
}
