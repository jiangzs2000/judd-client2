package com.shuyuan.judd.client.model.backstage.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author Sting
 * create 2017/05/08

 **/
@Data
public class MerchantManagerBasicInfoModel {
    //子商户的userId(商户id)
    private Integer userId;
    //创建时间，注册时间
    private Date createAt;
    //商户类型  1. 个人商户 2.个体商户 3.企业商户
    private Integer merchantType;
    //所属商户
    private String belongComemrcialName;
    //商户名称
    private String merchantName;
    //  用户类型:1:平台 2:商户 3.子商户
    private Integer userType;
    //登入账号
    private String loginAccount;
    //证件号
    private String certificateNo;
}
