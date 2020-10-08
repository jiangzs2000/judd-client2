package com.shuyuan.judd.client.model.platform;

import lombok.Data;

import java.util.Date;

/**
 * Created by Kevin
 * description:平台账户
 * date: 2018/11/23 10:24 AM
 */
@Data
public class PlatformAccountModel {
    private static final long serialVersionUID = 1409585292972743405L;
    private Long id;
    private String accountNo;
    private String account_type;
    private Long amount;
    private String create_user;
    private Date createTime;
    private String updateUser;
    private String updateTime;
    private int status;

}
