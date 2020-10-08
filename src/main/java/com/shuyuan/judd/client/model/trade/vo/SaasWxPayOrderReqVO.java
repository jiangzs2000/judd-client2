package com.shuyuan.judd.client.model.trade.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;


/**
 * @author Sting
 * create 2018/08/01

 * saas微信下单请求数据封装
 **/
@Data
public class SaasWxPayOrderReqVO {
    //初始金额
    private Double initMoney;
    //手续费用
    private Double payCharge;
    //入账金额
    private Double enterPayMoney;
    //总金额
    private Double totalMoney;
    //主账号(房东)id
    private String landlordId;
    //房间地址
    private String address;
    //用户微信token
    private String token;
    //支付类型
    private Integer feeType;
    //用户在子商户appid下的唯一标识
    private String openId;
    //小程序appId
    private String appId;
    //pay_orders_id
    private String payOrderId;
    //支付渠道, 在place order 里面 存放了config_payments_channel里的pay_channel_3rd字段
    private String payChannelName;
    //第三方和聚多多的手续费费率
    private Double costCharge;
    //费用承担方（renter:租客承担，landlord:公寓房承担）
    private String payAssume;
    //业务类型 (I:入款 O:出款 B：退款)
    private String bizType;
    //扩展字段
    private String extension;
    //分账模板id
    private String templateNo;
    //分账子账户userId 判断分账模板数量和子商户数量
    private JSONObject splitCmd;

    //发卡行编码
    private String gateId;
    //是否惠商下单
    private String isHuiShang;
}
