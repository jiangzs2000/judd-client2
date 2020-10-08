package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MerchantAccountModel implements Serializable {
    private static final long serialVersionUID = -1448943432443539241L;
    private int id;
    private String accountNo;
    private String accountType;
    private int amount;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
    private int status;
}
