package com.shuyuan.judd.client.model.order;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class RefundOrder {
    /**
     *平台唯一退款订单号
     */
    private String orderNo;
    /**
     * 退款日期YYYYMMDD
     */
    private String date;
    /**
     *商户号
     */
    private String merNo;
    /**
     *商户退款订单号
     */
    private String merOrderNo;
    /**
     *退款交易日期
     */
    private String merDate;
    /**
     *原消费订单号
     */
    private String oriOrderNo;
    /**
     * 原交易日期
     */
    private String oriDate;
    /**
     * 商户退款通知地址
     */
    private String notifyUrl;
    /**
     *退费金额，分。 分账订单退费时必填，担保订单退费时非必填？
     */
    private Long amount;
    /**
     *退款类型
     */
    private Integer refundType;
    /**
     *退款描述信息
     */
    private String refundDesc;
    /**
     *备注信息
     */
    private String remark;
    /**
     *原交易商户平台支付流水号
     */
    private String oriMerTrace;
    /**
     *手续费承担方,0-商户承担：退费手续费从给子商户的分账金额中扣除。
     * 1-平台承担退费手续费从商户平台在链金平台的手续费收益账户扣除。
     * (担保订单退费时该字段必填)
     */
    private Integer feePayer;
    /**
     *商户订单号, 分账指令(mer_dividing_cmd)中的dividing_order_no 字段值，即:该笔担保退费需要退当时分账指令中的哪一笔交易
     * (担保订单退费时该字段必填)
     */
    private String dividingOrderNo;
    /**
     * 商户发过来的dividingOrderNo存在在这个字段
     */
    private String dividingMerOrderNo;
    /**
     * 商户订单日期,分账指令(mer_dividing_cmd)中的dividing_mer_date 字段值。
     * (担保订单退费时该字段必填)
     */
    private String dividingMerDate;
    /**
     *手续费退费金额,担保订单退费时，退的手续费部分， 该金额由商户平台传递。
     * (担保订单退费时该字段必填，可为0)
     */
    private Long feeAmount;
    /**
     *渠道流水号
     */
    private String tradeNo;
    /**
     * 对账日期
     */
    private String merCheckDate;
    /**
     *I：初始，P：处理中，S:退款成功，F：退款失败
     */
    private String state;

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
