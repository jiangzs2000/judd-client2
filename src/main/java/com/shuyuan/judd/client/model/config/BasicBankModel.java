package com.shuyuan.judd.client.model.config;

import lombok.Data;

/**
 * Created by Kevin
 * description:卡bin信息表
 * date: 2019/1/7 8:45 PM
 */
@Data
public class BasicBankModel {
    private static final long serialVersionUID = 1727610844592079717L;
    private String bankAccount;
    private int cardLen;
    private int cardBinLen;
    private String binBankId;
    private String bankCardType;
    private String bankCardName;
    private String binBankName;
}
