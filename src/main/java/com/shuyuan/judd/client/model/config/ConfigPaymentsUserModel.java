package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class ConfigPaymentsUserModel implements Serializable {

    private static final long serialVersionUID = 5473090875526799242L;
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Integer createdById;
    private Integer updatedById;
    private Integer deletedById;
    private Integer version;
    private Integer isDelete;
    private Integer userType;
    private Integer wxShow;
    private Integer aliShow;
    private Integer cardShow;
    private String wxType;
    private String aliType;
    private String cardType;
}
