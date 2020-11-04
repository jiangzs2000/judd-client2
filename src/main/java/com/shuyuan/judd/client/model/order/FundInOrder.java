package com.shuyuan.judd.client.model.order;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class FundInOrder {
    /**
     *平台生成的唯一订单号
     */
    private String orderNo;
    /**
     * 平台收单交易的交易日期，YYYYMMDD
     */
    private String date;
    /**
     *发起交易的商户号
     */
    private String merNo;
    /**
     *商户发出的商户订单号
     */
    private String merOrderNo;
    /**
     * 商户上送的交易日期，YYYYMMDD
     */
    private String merDate;
    /**
     *交易选择的渠道编码
     */
    private String routingChannel;
    /**
     * 支付机构返回的交易订单号
     */
    private String tradeNo;
    /**
     *交易金额，分
     */
    private Long amount;

    /**
     *购买方会员编号
     */
    private String merCustId;
    /**
     *根据购买方在子商户入网时确认的子商户类型来传入即可，取值范围： 1：个人,2：个体,3：企业
     */
    private Integer merCustType;

    /**
     *2：担保订单,3：标准订单
     */
    private Integer orderType;
    /**
     *交易场景，1：pc 商城2：app 商城3：h5 商城4：现场售卖
     */
    private Integer orderPlace;
    /**
     *手续费承担方:payer:付款方 remittee:收款方  plat:平台承担(退款用)
     */
    private String assumePerson;
    /**
     *前端返回地址
     */
    private String retUrl;
    /**
     *平台生成的分账指令集合
     */
    private String dividingCmd;
    /**
     *商户发送的分账指令
     */
    private String merDividingCmd;
    /**
     * 该笔订单产生的平台自行计算的通道成本，分，与实际成本可能会有浮点出入
     */
    private Long channelCost;
    /**
     *支付方式，用于计算费率，该字段不填，按默认费率计算。
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
     *交易状态: I 初始 S 成功 P 处理中 F 失败 C 关闭，成功、失败关闭是终态，其余状态可以发起重新支付
     */
    private String state;
    /**
     *支付成功的支付流水号
     */
    private String paymentTrace;
    /**
     * 订单支付成功成功的日期，YYYYMMDD
     */
    private Timestamp payedTime;
    /**
     * 结算金额，分，通知支付成功后填写
     */
    private Long settleAmt;
    /**
     *对账日期，，通知支付成功后填写
     */
    private String merCheckDate;
    /**
     * 担保订单专用，订单完成日期，YYYYMMDD
     */
    private String finishDate;
    /**
     *订单退款状态，P:已部分退款， W：已全部退款
     */
    private String refundState;
    /**
     *已退款金额，分
     */
    private Long refundedAmt;
    /**
     * 备注
     */
    private String remark;
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

    public static class State {
        public static final String INIT = "I";
        public static final String SUCCESS = "S";
        public static final String PROCESSING = "P";
        public static final String FAILED = "F";
        public static final String CLOSED = "C";
        public static final String FINISHED = "SF";
    }
    public static class OrderType{
        public static final int QUARANTEE = 2;
        public static final int STANDARD = 3;
    }
    public static class RefundState{
        public static final String NONE = "N";
        public static final String PART_REFUNDED = "P";
        public static final String COMPLETED = "C";
    }
}
