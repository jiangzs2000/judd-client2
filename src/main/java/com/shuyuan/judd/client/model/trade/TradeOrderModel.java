package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Kevin
 * description:
 * date: 2018/11/6 10:09 PM
 */
@Data
public class TradeOrderModel implements Serializable {
    private static final long serialVersionUID = 1409585292972743405L;
    private int id;
    private int merchantBankId;
    private String pid;
    private String tradeVoucherNo;
    private String tradeNo;
    private String tradeNoThirdParty;
    private String tradeName;
    private int settlementType;
    private int feeType;
    private int amount;
    private String bankCode;
    private String instCode;
    private String tradePeople;
    private String payWay;
    private String tradeStatus;
    private String fundFlow;
    private String assumePerson;
    private String bizType;
    private String memo;
    private String extension;
    private Integer createUser;
    private Date createTime;
    private int updateUser;
    private Date updateTime;
    private int status;
    private String orderId;
    private String merTrace;

}
