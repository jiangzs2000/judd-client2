package com.shuyuan.judd.client.model.backstage;

import lombok.Data;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/1
 */
@Data
public class MerchantDataModel {

    //创建时间
    private String time;
    //商户id
    private int id;
    //商户名称
    private String name;
    //用户类型
    private Integer type;
    //所属商户
    private String parentName;
    //商户状态
    private String reviewStatus;
    //营业执照号
    private String businessLicenseNo;
    //商户类型
    private int merchantType;

    private Integer status;
}
