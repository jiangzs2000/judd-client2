package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/30
 */
@Data
public class CSVModel {

    //交易日期
    private String date;
    //交易时间
    private String time;
    //交易流水号
    private String tradeNo;
    //商户名称
    private String merchantName;
    //业务类型
    private String businessType;
    //是否分账
    private String routing;
    //支付方式
    private String payWay;
    //交易金额
    private BigDecimal amount;
    //手续费
    private BigDecimal feeAmount;
    //结算金额
    private BigDecimal settlementAmount;
    //排序时间
    private Date hour;
    //用户交易订单
    private String tradeVoucherNo;

    public String[] toStringList() {
        return new String[]{this.getDate(), this.getTime(), this.getTradeVoucherNo(), this.getTradeNo(), this.getMerchantName(),
                this.getBusinessType(), this.getRouting(), this.getPayWay(), this.getAmount().toString(), this.getFeeAmount().toString(),
                this.getSettlementAmount().toString()};
    }
}
