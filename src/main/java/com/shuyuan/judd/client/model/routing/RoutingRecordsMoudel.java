package com.shuyuan.judd.client.model.routing;

import lombok.Data;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/18
 */
@Data
public class RoutingRecordsMoudel {

    //分账id
    private Integer routingId;
    //支付时间
    private String createTime;
    //关联流水号
    private String tradeNo;
    //商户名
    private String merchantName;
    //所属商户
    private String pertainmMerchant;
    //分账金额
    private Double amount;
}
