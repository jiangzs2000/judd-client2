package com.shuyuan.judd.client.model.routing;

import lombok.Data;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/18
 */
@Data
public class RecordDetailsMoudel {
    //商户名
    private String merchantName;
    //商户id
    private String merchantNo;
    //分账金额
    private Double routingAmount;
    //分账模板
    private String routingName;
    //模板id
    private String routingNo;
    //分账顺序方
    private String routingSort;
    //通道方承担方
    private Integer slottingFeeAssumeer;
    //支付时间
    private String time;
    //支付流水号
    private String tradeNo;
    //所属商户
    private String pertainmMerchant;
    //账单金额
    private Double amount;
    //通道费
    private Double serviceAmount;
    //通道费承担方
    private String assumePerson;
}

