package com.shuyuan.judd.client.model.bill;

import lombok.Data;

import java.util.Date;

/**
 * Created by Kevin
 * description:历史流水
 * date: 2018/11/23 10:54 AM
 */
@Data
public class BillHistoryOrderModel {
    private static final long serialVersionUID = -3882418593021065436L;
    private int merchant_no;
    private String orgi_id;
    private String order_type;
    private String trade_no;
    private int amount;
    private Date biz_date;
    private String compare_bath_no;
    private Date compare_date;
    private Date create_time_orgi;
    private String operate;
    private String operate_gather;
    private String memo;
    private String clearing_flag;
    private String biz_type;
    private String orgi_memo;
    private String clear_file_name;
    private String create_user;
    private String update_user;
    private Date create_time;
    private Date update_time;
    private int status;
}
