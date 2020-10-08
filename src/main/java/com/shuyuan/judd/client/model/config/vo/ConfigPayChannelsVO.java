package com.shuyuan.judd.client.model.config.vo;

import lombok.Data;

import java.util.Map;

/**
 * @author Sting
 * create 2018/07/17

 **/
@Data
public class ConfigPayChannelsVO {
    //微信通道展示
    private Integer wxShow;
    //支付宝通道展示
    private Integer aliShow;
    //银行卡通道展示
    private Integer cardShow;
    //微信通道方式（渠道方）
    private String wxType;
    //支付宝通道方式（渠道方）
    private String aliType;
    //快捷支付方式（渠道方）
    private String cardType;
    //微信第三层级通道
    private String wxType3rd;
    //支付宝第三层级通道
    private String aliType3rd;
    //快捷支付第三层级通道
    private String cardType3rd;
    //费用承担方(renter:租客landlord:房东)
    private String payAssume;
    //用户类型（0:普通用户，1:平安空中分账，2:联动分账）
    private Integer userType;
    //微信手续费率
    private Double wxPercent;
    //支付宝手续费率
    private Double aliPercent;
    //借记卡手续费率
    private Double cardPercent;
    //银行卡信息
    private Map<String, String> cardInfo;
}
