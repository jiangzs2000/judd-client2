package com.shuyuan.judd.client.model.bill;

import lombok.Data;

import java.util.Date;

/**
 * Created by Kevin
 * description:清算流水
 * date: 2018/11/23 10:52 AM
 */
@Data
public class BillCleanOrderModel {
    private static final long serialVersionUID = -3882418593021065436L;
    private int id;
    private int merchantNo;
    private String tradeNo;
    private String tradeNoThirdparty;
    private String amount;
    private String bankCode;
    private String clearDate;
    private String compareFlag;
    private String compareDate;
    private String compareBathNo;
    private String operate;
    private String bizType;
    private String clearFileName;
    private String memo;
    private String hisFlag;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
    private int status;
    //手续费承担方:renter:租客承担 landlord:房东承担
    private String assumePerson;
    //分账顺序方
    private Integer slottingFeeAssumeer;
    //分账金额
    private String routingAmount;
    //分账模板id
    private String templateNo;
    //用户交易订单号
    private String tradeVoucherNo;
    //手续费
    private Integer serviceCharge;
    //退款承担方
    private String refund;
}
