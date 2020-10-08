package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Boris
 * create 2018/10/15
 * 
 **/
@Data
//交易汇总清单
public class TransactionSummaryModel implements Serializable{

    private static final long serialVersionUID = 1409585292972743405L;

    //交易类型
    private String transactionType;
    //交易金额
    private String transactionAmount;
    //交易笔数
    private String transactionCount;
    //手续费
    private String serviceCharge;
    //结算金额
    private String settlementAmount;
}
