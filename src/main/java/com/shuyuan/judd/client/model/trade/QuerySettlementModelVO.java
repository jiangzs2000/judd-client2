package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Boris
 * create 2018/10/18
 * 
 **/
@Data
public class QuerySettlementModelVO {
    //数据内容
    private List<QuerySettlementModel> querySettlementModels;
    //数据总数
    private Integer count;
    //当前页数
    private Integer page;
    //总页数
    private Integer pages;
    //提现总金额
    private BigDecimal countAmount;

    private BigDecimal countFee;
}
