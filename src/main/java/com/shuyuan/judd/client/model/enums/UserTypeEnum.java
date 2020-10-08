package com.shuyuan.judd.client.model.enums;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/2/28
 */
public enum UserTypeEnum {

    ADMIN(1),
    PLATFORM(2),
    SUB_MERCHANTS(3);

    int userType;

    UserTypeEnum(int userType) {
        this.userType = userType;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
