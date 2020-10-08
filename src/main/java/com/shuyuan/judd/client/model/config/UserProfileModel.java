package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserProfileModel implements Serializable {

    private static final long serialVersionUID = 3392267603494895082L;
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Integer version;
    private Integer isDelete;
    private String company;
    private String name;
    private String phone;
    private Integer createdById;
    private Integer deletedById;
    private Integer updatedById;
    private Integer userId;
    private String address;
    private Integer isFranchisee;
    private Integer isFirstLogin;
    private String area;
    private Double creditCeiling;
    private Double creditUsed;
    private String idNumber;
    private Integer isTest;
    private String terminal;
    private String companyPostfix;
    private String urlFrom;
    private String city;
    private String companyBrand;
    private String province;
    private Integer avatarId;
    private Date backupsAt;
    private String email;
    private Integer interval;
    private Integer isFreeze;
    private Integer isOnline;
    private Integer level;
    private Integer isChannel;
    private Integer isLoan;
    private String referral;
    private Integer status;
    private Integer vipAction;
    private Date vipExpireAt;
    private Integer vipLevel;
    private Integer vipStatus;
    private String legalPerson;
    private String operateCity;
    private Integer operateMode;
    private Integer idauthType;
    private Integer shuidiVip;
    private String isEffective;
    private String identity;
    private String companyLogo;

}
