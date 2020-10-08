package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kevin
 * description:个人银行卡信息
 * date: 2019/1/7 3:24 PM
 */
@Data
public class PersonBankModel implements Serializable {
    private Long id;
    private String payWay;
    private String cardNo;
    private String idNo;
    private String idType;
    private String bankCode;
    private String merCustId;
    private String cardType;
    private String cardHolder;
    private String bankName;
    private String branchName;
    private String mobileNo;
    private String pAgreementId;
    private Integer isUse;
    private String extension;
    private Date createTime;
    private Date updateTime;
    private Integer status;
}
