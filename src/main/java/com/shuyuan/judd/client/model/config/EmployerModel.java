package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.util.Date;

@Data
public class EmployerModel {

    private Integer id;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Integer version;
    private Integer isDelete;
    private String name;
    private String phone;
    private String remark;
    private Integer bossId;
    private Integer createdById;
    private Integer deletedById;
    private Integer updatedById;
    private Integer userId;
    private Integer roleId;
    private String accountType;
    private Integer avatarId;

}
