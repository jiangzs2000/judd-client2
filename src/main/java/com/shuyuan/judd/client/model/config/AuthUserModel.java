package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.util.Date;

@Data
public class AuthUserModel {

    private Integer id;
    private String password;
    private Date lastLogin;
    private Integer isSuperuser;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Integer isStaff;
    private Integer isActive;
    private Date dateJoined;

}
