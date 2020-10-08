package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Kevin
 * description:
 * date: 2018/11/6 10:23 PM
 */
@Data
public class MerchantSettleModel implements Serializable {
    private static final long serialVersionUID = 1409585292972743405L;
    private int id;
    private String trade_no;
    private int fee_type;
    private BigDecimal settleAmount;
    private BigDecimal realAmount;
    private BigDecimal settleFee;
    private String bankCode;
    private String instCode;
    private Date startTime;
    private Date endTime;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date update_time;
    private int status;
}
