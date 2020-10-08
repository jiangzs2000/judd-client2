package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Boris
 * create 2018/10/15
 * 
 **/
@Data
//交易对账明细
public class ReconciliationDetailsModel implements Serializable {
    private static final long serialVersionUID = 1409585292972743405L;

    //交易日期
    private String transactionDate;
    //交易时间
    private String transactionTime;
    //交易流水
    private String treadNo;
    //支付方式
    private String paymentType;
    //交易类型
    private String bizType;
    //交易金额
    private String transactionAmount;
    //手续费
    private String serviceCharge;
    //结算金额
    private String settlementAmount;
}
