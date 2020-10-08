package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * 支付销售协议，按支付方式指定服务费率
 */
@Data
public class PaySalesAgreement {
    private Long id;
    private String merchantNo;
    private BigDecimal serviceChargePercent;
    private String payWayRating;
    private Date effectiveDate;
    private Date expireDate;
    private String assumePerson = "remittee";
    private String refundAssumePerson = "remittee";
    private Long createUser;
    private Timestamp createTime;
    private Long updateUser;
    private Timestamp updateTime;
    private Integer status;
    /**
     * 非数据库字段
     */
    private String merchantName;
}
