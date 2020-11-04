package com.shuyuan.judd.client.model.merchant;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Long pid;

    private String merchantNo;

    private String name;

    private String email;

    private String idType;

    private String idNo;

    private int authStatus;

    private String userName;

    private String password;

    private String mobile;

    private Long createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    private int status;

    private String roles;

    private String avatar;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
