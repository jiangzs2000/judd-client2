package com.shuyuan.judd.client.model.order;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class WithdrawOrder {

    private String orderNo;

    private String date;

    private String notifyUrl;

    private String merNo;

    private String merOrderNo;

    private String merDate;
    /**
     * 要提现的商户
     */
    private String merchantNo;
    /**
     * 按子商户类型来传入，取值范围： 1：个人商户
     * 2：个体工商户
     * 3：企业商户
     */
    private Integer merchantType;
    /**
     *支付协议号, 客户非首次支付、子商户支付时必填
     */
    public String pAgreementId;

    private String routingChannel;

    private Long amount;

    private String remark;
    /**
     * saas平台提现手续费，分（平台自己计算的结果）
     */
    private Long platFeeAmt;
    /**
     * 渠道提现手续费，分（平台自己计算的结果）
     */
    private Long channelFeeAmt;

    private String tradeNo;

    private String merCheckDate;
    /**
     * 渠道返回的提现手续费金额, 分
     */
    private Long channelRetFeeAmt;
    /**
     * I：初始，P：处理中，S:成功，F：失败
     */
    private String state;

    private Long createUser;

    private Timestamp createTime;

    private Timestamp updateTime;
    /**
     * 记录数据状态 1正常 0无效
     */
    private Integer status;

    public static class State{
        public static final String INIT = "I";
        public static final String PROCESSING = "P";
        public static final String SUCCESS = "S";
        public static final String FAIL = "F";

    }
}
