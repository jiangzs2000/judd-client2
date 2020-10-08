package com.shuyuan.judd.client.model.config.vo;

import lombok.Data;

/**
 * @author Sting
 * create 2018/07/11

 **/
@Data
public class CalculateChargeVO {
    //平台手续费
    private Double costCharge;
    //手续费用
    private Double payCharge;
    //总金额
    private Double totalPayMoney;
    //初始金额
    private Double initPayMoney;
    //入账金额
    private Double enterPayMoney;
    //费用承担方
    private String payAssume;
    //支付渠道类型
    private String channelType;
    //支付渠道详细通道
    private String channel3rdType;

}
