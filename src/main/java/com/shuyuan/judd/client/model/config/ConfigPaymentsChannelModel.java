package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ConfigPaymentsChannelModel implements Serializable {
    private static final long serialVersionUID = 30099904903585913L;
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private Integer createdById;
    private Integer updatedById;
    private Integer deletedById;
    private Integer version;
    private Integer isDelete;
    private String payChannel;
    private String payChannelName;
    private Double defaultCharge;
    private Double costCharge;
    private String payType;
    private String useCase;
    private String payChannel3rd;
    private int defaultUse;
    private String thirdPayWay;

}
