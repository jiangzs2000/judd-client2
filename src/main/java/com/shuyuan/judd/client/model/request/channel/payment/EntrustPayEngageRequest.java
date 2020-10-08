package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class EntrustPayEngageRequest {

    private String version;
    /**
     *商户生成的标识该笔交易的编号， 编号支持数字、英文字母组合使用，
     * 类型为字符串；订单号必须唯一
     */
    private String order_no;
    /**
     *平台生成订单的日期，格式
     * YYYYMMDD，类型为字符串
     */
    private String date;
    /**
     *商户平台给子商户分配的唯一编号
     */
    private String mer_cust_id;
    /**
     *持卡人在银行开立该卡时在银行登
     * 记的手机号
     */
    private String moble_no;
    /**
     *卡号
     */
    private String card_no;
    /**
     *姓名
     */
    private String card_holder;
    /**
     *证件类型,固定为：1（身份证）
     */
    private String id_type;
    /**
     *证件号
     */
    private String id_no;

}
