package com.shuyuan.judd.client.model.backstage.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author Sting
 * create 2017/05/21

 **/
@Data
public class SystemManagMyInfoModel {
    //子商户的userId(商户id)
    private Integer userId;
    //创建时间，注册时间
    private Date createAt;
    //商户类型  1. 个人商户 2.个体商户 3.企业商户
    private Integer merchantType;
    //商户名称(开户人)
    private String merchantName;
    //登入账号
    private String loginAccount;
    //证件号
    private String certificateNo;
    //开户银行
    private String bankName;
    //银行账号
    private String bankCardNo;
    //开户人
    private String accountName;


}
