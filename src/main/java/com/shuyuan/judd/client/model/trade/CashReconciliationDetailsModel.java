package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Boris
 * create 2018/10/15
 * 
 **/
@Data
//提现对账明细
public class CashReconciliationDetailsModel implements Serializable {

    private static final long serialVersionUID = 1409585292972743405L;
    //提现日期
    private String cashDate;
    //提现时间
    private String cashTime;
    //提现流水号
    private String cashNo;
    //提现类型
    private String cashType;
    //提现金额
    private String cashAmount;
    //手续费
    private String serviceCharge;
    //到账金额
    private  String arrivalAccount;
}
