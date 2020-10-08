package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kevin
 * description:商户交易对象
 * date: 2018/10/7 2:07 PM
 */
@Data
public class MerchantTradeOrderModel implements Serializable {
    private static final long serialVersionUID = -3882418593021065436L;
    //入款凭证作为第二次出款跑批的凭证
    private String tradeVoucherNo;
    //聚多多交易流水id
    private String tradeNo;
    //第三方交易流水号
    private String tradeNoThird;
    //用户Id
    private int userId;
    //第三方商户Id
    private String merchantNoThird;
    //对公对私标识 B对公 C 对私
    private String flag;
    //协议号
    private String pAgreementId;
    //金额
    private int amount;
    //业务类型
    private String bizType;
    //交易状态
    private String tradeStatus;
    //支付通道
    private String payChannel;
    //费用类型
    private int feeType;
    //聚多多用户id
    private int createUser;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

    //开始时间
    private String startTime;
    //结束时间
    private String endTime;
    //商户类型
    private String merchantType;
    //提现模式
    private int withdrawDepositType;
    //提现规则
    private String withdrawDepositRule;
    //提现流水和银行卡关联号
    private int merchantBankId;
}
