package com.shuyuan.judd.client.model.backstage.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Sting
 * create 2017/05/18

 **/
//设置中心-支付设置页面对象
@Data
public class SetCenterPaySetModel {
    //商户id
    private String userId;
    //商户名称
    private String merchantName;
    //用户类型:1:平台 2:商户 3.子商户
    private String userType;
    //assumePerson:费用承担方，payCharge：支付通道费， 生效时间:effectiveTime
    private List<Map<String, String>> paySet;

}
