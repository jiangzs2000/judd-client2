package com.shuyuan.judd.client.model.enums.config;

/**
 * @author Sting
 * create 2018/08/27
* todo: remove
 **/
@Deprecated
public enum ConfigPayUserTypeEnum {
    COMMON_USER(0),
    PINGAN_USER(1),
    LD_USER(2);
    private Integer code;

    ConfigPayUserTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
