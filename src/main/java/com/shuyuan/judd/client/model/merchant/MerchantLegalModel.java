package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kevin
 * description:法人信息对象
 * date: 2018/11/6 10:01 PM
 */
@Data
public class MerchantLegalModel implements Serializable {
    private static final long serialVersionUID = 1409585292972743405L;
    private int id;
    private String merchantName;
    private String idNo;
    private String idNoUrl;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private String updateTime;
    private int status;
}
