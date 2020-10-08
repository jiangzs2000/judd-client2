package com.shuyuan.judd.client.model.merchant;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Merchant implements Serializable {
    private String no;
    private String pno;
    private int merchantType;
    private String merchantName;
    private String province;
    private String city;
    private String area;
    private String registrationNumber;
    private String licenceUrl;
    private String idName;
    private String idNo;
    private String idFrontSideUrl;
    private String idBackSideUrl;
    private String contactName;
    private String mobileNo;
    private String businessLicenseNo;
    private String businessLicenseUrl;
    private String isBlocking;
    private Integer withdrawDepositType;
    private String withdrawDepositRule = "T+1";
    private Date startDate;
    private Date endDate;
    private String notificationUrl;
    private Long createUser;
    private Date createTime;
    private Long updateUser;
    private Date updateTime;
    private Integer status;
    private String extension;
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
