package com.shuyuan.judd.client.model.config;

import java.io.Serializable;
import java.util.Date;

public class BankAccountModel implements Serializable {
    private static final long serialVersionUID = 1727610844592079717L;
    private int id;
    private String bankAccount;
    private int cardLen;
    private int cardBinLen;
    private String binBankId;
    private int bankCardType;
    private String bankCardName;
    private Date createTime;
    private Date updateTime;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getCardLen() {
        return cardLen;
    }

    public void setCardLen(int cardLen) {
        this.cardLen = cardLen;
    }

    public int getCardBinLen() {
        return cardBinLen;
    }

    public void setCardBinLen(int cardBinLen) {
        this.cardBinLen = cardBinLen;
    }

    public String getBinBankId() {
        return binBankId;
    }

    public void setBinBankId(String binBankId) {
        this.binBankId = binBankId;
    }

    public int getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(int bankCardType) {
        this.bankCardType = bankCardType;
    }

    public String getBankCardName() {
        return bankCardName;
    }

    public void setBankCardName(String bankCardName) {
        this.bankCardName = bankCardName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
