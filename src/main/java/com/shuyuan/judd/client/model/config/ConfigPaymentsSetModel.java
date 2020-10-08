package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ConfigPaymentsSetModel implements Serializable {
    private static final long serialVersionUID = -3885675616606217789L;
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Integer createdById;
    private Integer updatedById;
    private Integer deletedById;
    private Integer version = 0;
    private Integer isDelete = 0;
    private Double serviceCharge;
    private String assumePerson;
    private Integer paymentsChannelId;

}
