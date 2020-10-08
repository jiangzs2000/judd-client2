package com.shuyuan.judd.client.model.request.channel.order;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class FundInOrderRequest {

    /**
     * 商户生成的标识该笔交易的编号，编号支持数字、英文字母组合使用；
     * 订单号必须唯一
     */
    private String orderNo;
    /**
     * 订单类型,
     * 2：担保订单
     * 3：标准订单
     */
    private Integer orderType;
    /**
     * 交易场合
     * 1：pc商城
     * 2：app商城
     * 3：h5商城
     * 4：现场售卖
     */
    private Integer orderPlace;
    /**
     * 交易日期生成订单的日期，格式YYYYMMDD，
     */
    private String date;
    /**
     * 购买方会员编号, 平台给子商户分配的会员编，
     */
    private String customerId;
    /**
     * 根据购买方在子商户入网时确认的子商户类型来传入即可，取值范围：
     * 1：个人商户
     * 2：个体工商户
     * 3：企业商户
     */
    private Integer customerType;
    /**
     * 金额，分
     */
    private Long amount;
    /**
     * 收货人，非必填
     */
    private String consigneeName;
    /**
     * 收货地址,非必填
     */
    private String consigneeAddress;
    /**
     * 联系电话，非必填
     */
    private String consigneePhone;
    /**
     * 备注信息，非必填
     */
    private String remark;
    /**
     * 前台通知地址,类网银操作，非必填
     */
    private String retUrl;
    /**
     * 子订单信息，具体格式参见数据明细
     * 子订单集合，本期不验证，详见“sub_order_info数据明细集合”
     * 存储该字段格式：
     * List<map<String, Object>>，JSONString
     * [{"sub_order_id":"商户订单号，非必填", "sub_mer_date":"子交易订单日期,格式YYYYMMDD，非必填",
     * "merchant_no":"收款方子商户编号", "sub_amount":"金额,分", "send_time":"配送时间,Timerstamp.toString()，非必填",
     * "sender": "配送方，非必填", "send_no": "配送单号，非必填", "remark": "备注信息，非必填"}]
     */
    private String subOrderInfo;
    /**
     * 当订单类型(order_type)为担保订单(2) 及标准订单(3)时，本字段必填；
     * 分账指令集合，详见“dividing_cmd数据明细集合”，存储该字段格式：
     * List<map<String, Object>>, JSONString
     * [{"dividing_order_id":"分账明细订单号,类型为字符串", "dividing_mer_date":"分账明细订单日期,格式YYYYMMDD",
     * "dividing_merchant_no":"收款方会员编号", "dividing_category": "1：百分比(暂不支持), 2：固定金额",
     * "dividing_amount":"单位：分,分账金额", "is_fee_payer":"是否手续费承担方,0：否 1：是"}]
     *
     */
    private String dividingCmd;
    /**
     * 请求被路由去的目标渠道的编码，在第一次街道请求后，根据路由算法生成
     */
    private String routingChannel;

    public static void main(String[] args){
        String s = "[{\"dividing_order_id\":\"分账明细订单号,类型为字符串\", \"dividing_mer_date\":\"分账明细订单日期,格式YYYYMMDD\"," +
      "\"in_user_id\":\"收款方会员编号\", \"dividing_category\": \"1：百分比(暂不支持), 2：固定金额\"," +
      "\"dividing_amount\":\"单位：分,分账金额\", \"is_fee_payer\":\"是否手续费承担方,0：否 1：是\"}]";

        List<Map> res = JSONObject.parseArray(s, Map.class);
        System.out.println(res.size());
    }

}
