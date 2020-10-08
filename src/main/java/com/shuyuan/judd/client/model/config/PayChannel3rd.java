package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
public class PayChannel3rd {
    private Long id;
    private String channelCode;
    private String channelName;
    private String instCode;
    private String instName;
    private BigDecimal costChargePercent;
    private String payWayRating;
    private Date effectiveDate;
    private Date expireDate;
    private Long createUser;
    private Timestamp createTime;
    private Long updateUser;
    private Timestamp updateTime;
    private Integer status;
}
