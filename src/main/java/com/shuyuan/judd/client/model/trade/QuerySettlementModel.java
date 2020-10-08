package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Boris
 * create 2018/10/07
 * 
 **/
@Data
public class QuerySettlementModel implements Serializable {

    private static final long serialVersionUID = 1409585292972743405L;
    //交易时间
    private String createTime;
    //交易流水号
    private String tradeNo;
    //收款银行
    private String bankName;
    //银行卡号
    private String cardNo;
    //结算类型
    private String settlementType;
    //经办人
    private String name;
    //交易状态
    private String tradeStatus;
    //业务类型
    private String bizType;
    //总金额
    private BigDecimal amount;
    //手续费
    private BigDecimal serviceFee;
    //到账金额
    private BigDecimal enterMoney;
    //杂项数据
    private String extension;
    //'费用类型 1交易额 2 机构手续费 3平台手续费4结算手续费'
    private String feeType;
    //商户编号
    private Integer userId;
    //公寓名称
    private String apartmentName;
    //银行账户类型
    private String bankAccount;
    //出款机构
    private String paymentInstitution;
    //资金流向
    private String fundFlow;
    //提现成功时间
    private String updateTime;
    // 后台入账记录所需交易类型
    private String transactionType;
    //商户名称
    private String merchantName;
    //退款原订单号
    private String tradeNoThird;
    //退款说明
    private String memo;
    //手续费承担方
    private String assumePerson;

    public QuerySettlementModel() {

    }

    public QuerySettlementModel(String createTime, String tradeNo, BigDecimal amount, String transactionType) {
        this.createTime = createTime;
        this.tradeNo = tradeNo;
        this.amount = amount;
        this.transactionType = transactionType;
    }
}
