package com.shuyuan.judd.client.model.bill;

import lombok.Data;

import java.util.Date;

/**
 * Created by Kevin
 * description:入账流水
 * date: 2018/11/23 10:53 AM
 */
@Data
public class BillInOutOrderModel {
    private static final long serialVersionUID = -3882418593021065436L;
    private int id;
    private int merchantNo;
    private String tradeNo;
    private String tradeNoThird;
    private int amount;
    private String bankCode;
    private Date accountDate;
    private String compareFlag;
    private Date compareDate;
    private String compareBathNo;
    private String operate;
    private String bizType;
    private String memo;
    private String hisFlag;
    private Date createTime;
    private Date updateTime;
    private int status;

}
