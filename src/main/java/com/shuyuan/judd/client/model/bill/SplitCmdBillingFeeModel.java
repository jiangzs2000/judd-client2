package com.shuyuan.judd.client.model.bill;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import com.shuyuan.judd.client.model.routing.BasicRoutingTemplate;

import java.util.List;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/8
 */
@Data
public class SplitCmdBillingFeeModel {
    //总金额
    private String totalAmount;
    //第三方费率
    private String costCharge;
    //总手续费
    private String payCharge;
    //费用承担方（renter:租客承担，landlord:公寓房承担）
    private String assumePerson;
    //分账商户及顺序
    private JSONObject jsonObject;
    //分账模板
    private List<BasicRoutingTemplate> basicRoutingTemplates;
}
