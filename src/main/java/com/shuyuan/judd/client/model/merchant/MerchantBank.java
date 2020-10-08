package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MerchantBank implements Serializable {
    private Long id;
    private String merchantNo;
    private String cardNo;
    private String bankCode;
    private String accountName;
    private String province;
    private String city;
    private String area;
    private String branchName;
    private String mobile;
    private String extension;
    private String pAgreementId;
    private String bankName;
    private String flag;
    private String cardType;
    private Integer isUse;
    private Long createUser;
    private Date createTime;
    private Long updateUser;
    private Date updateTime;
    private Integer status;
}
