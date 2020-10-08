package com.shuyuan.judd.client.model.backstage.vo;

import lombok.Data;

/**
 * @author Sting
 * create 2017/05/30

 **/
@Data
public class MerchantAccountResponseModel {
    //商户id
    private String userId;
    //商户名称
    private String merchantName;
    //用户类型:2：平台用户 3:普通用户
    private String userType;
    //所属商户
    private String belongMerchantName;
    //可提现金额
    private String allowWithDrawAmonut;
    //不可提现金额
    private String notAllowWithDrawAmount;
    //保证金
    private String cashDeposit;

}
