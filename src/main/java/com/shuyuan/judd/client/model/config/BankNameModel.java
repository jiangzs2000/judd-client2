package com.shuyuan.judd.client.model.config;

import java.io.Serializable;
import java.util.Date;

public class BankNameModel implements Serializable {
    private static final long serialVersionUID = -2039971196715117099L;
    private int id;
    private String binBankId;
    private String binBankName;
    private Date createTime;
    private Date updateTime;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBinBankId() {
        return binBankId;
    }

    public void setBinBankId(String binBankId) {
        this.binBankId = binBankId;
    }

    public String getBinBankName() {
        return binBankName;
    }

    public void setBinBankName(String binBankName) {
        this.binBankName = binBankName;
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
