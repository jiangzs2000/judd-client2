package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Boris
 * create 2018/10/15
 * 
 **/
@Data
//提现汇总清单
public class CashSummaryModel implements Serializable{

    private static final long serialVersionUID = 1409585292972743405L;
    //提现类型
    private String cashType;
    //提现金额
    private String cashAmount;
    //提现笔数
    private String cashCount;
    //手续费
    private String serviceCharge;
    //到账金额
    private String arrivalAccount;
}
