package com.shuyuan.judd.client.model.order;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PaymentTrace {
    /**
     *平台生成的支付流水号
     */
    private String trace;
    /**
     *平台交易日期，YYYYMMDD
     */
    private String date;
    /**
     *需要支付的平台唯一订单编号
     */
    private String orderNo;
    /**
     *发起支付的商户编号
     */
    private String merNo;
    /**
     *商户上送的支付流水号
     */
    private String merTrace;
    /**
     *商户上送的交易日期，YYYYMMDD
     */
    private String merDate;
    /**
     * 通知地址
     */
    private String notifyUrl;
    /**
     *路由的三方支付渠道编码
     */
    private String routingChannel;
    /**
     *三方机构返回的业务订单编号
     */
    private String tradeNo;
    /**
     *金额，分
     */
    private Long amount;
    /**
     *计算金额，分
     */
    private Long settleAmt;
    /**
     *三方返回的对账日期
     */
    private String merCheckDate;
    /**
     *支付方式，
     * SCAN: 主动扫码支付
     * BESCAN: 被动扫码支付
     * VIPCN: 公众号支付
     * APPLET: 小程序支付
     * APP: APP支付
     * DEBIT_FASTPAY: 借记卡快捷支付
     * CREDIT_FASTPAY: 贷记卡快捷支付
     */
    private String payWay;
    /**
     *交易状态: I 初始 S 成功 P 处理中 F 失败
     */
    private String state;
    /**
     *扩展字段，存放不同支付方式的支付要素，注意只存放非敏感信息
     */
    private String extension;
    /**
     *备注
     */
    private String remark;
    /**
     *订单退款状态，P:已部分退款， W：已全部退款
     */
    private String refundState;
    /**
     *已退款金额，分
     */
    private Long refunedAmt;
    /**
     *创建时间
     */
    private Timestamp createTime;
    /**
     *最后一次更新时间
     */
    private Timestamp updateTime;
    /**
     *记录数据状态 1正常 0无效
     */
    private Integer status;

    public static class State{
        public static final String INIT = "I";
        public static final String SUCCESS = "S";
        public static final String PROCESSING = "P";
        public static final String FAILED = "F";
    }
}
