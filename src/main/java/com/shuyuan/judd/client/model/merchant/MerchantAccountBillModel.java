package com.shuyuan.judd.client.model.merchant;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kevin
 * description:
 * date: 2018/11/6 10:35 PM
 */
@Data
public class MerchantAccountBillModel implements Serializable {
    private static final long serialVersionUID = 1409585292972743405L;
    private String id;
    private String accountBillName;
    private String accountBillUrl;
    private int accountBillTime;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date update_time;
    private int status;

}
