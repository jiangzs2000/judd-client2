package com.shuyuan.judd.client.model.backstage.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Sting
 * create 2017/05/19

 **/
//设置中心-提现设置页面对象
@Data
public class SetCenterWithdrawSetModel {
    //商户id
    private String userId;
    //商户名称
    private String merchantName;
    //用户类型:2：平台用户 3:普通用户
    private String userType;
    //提现通道费(5元/笔)
    private String withDrawCharge;
    //提现模式 withDrawType 0.手动提现 1.自动提现 ;      生效时间:effectiveTime
    private List<Map<String, String>> withDrawSet;

}
