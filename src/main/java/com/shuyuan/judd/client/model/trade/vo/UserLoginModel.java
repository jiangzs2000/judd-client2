package com.shuyuan.judd.client.model.trade.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/2/22
 */
@Data
public class UserLoginModel implements Serializable {
    private static final long serialVersionUID = 1409585292972743405L;

    //用户名
    private String userName;
    //密码
    private String password;
    //验证登录状态
    private String token;
    //新密码
    private String newPassword;
}
