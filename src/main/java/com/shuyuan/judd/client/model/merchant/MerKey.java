package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MerKey {
    private String merNo;
    private String publickey;
    private Long createUser;
    private Timestamp createTime;
    private Long updateUser;
    private Timestamp updateTime;
    private Integer status;
}
