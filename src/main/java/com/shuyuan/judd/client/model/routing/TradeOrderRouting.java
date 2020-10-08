package com.shuyuan.judd.client.model.routing;

import java.io.Serializable;
import java.util.Date;

public class TradeOrderRouting implements Serializable {
    private Long id;

    private String tradeNoThird;

    private String tradeNo;

    private String tradeNoRouting;

    private int feeType;

    private Integer amount;

    private String tradeStatus;

    private String bizType;

    private String assumePerson;

    private String templateNo;

    private Integer slottingFeeAssumeer;

    private String memo;

    private String extension;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    private int status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradeNoThird() {
        return tradeNoThird;
    }

    public void setTradeNoThird(String tradeNoThird) {
        this.tradeNoThird = tradeNoThird == null ? null : tradeNoThird.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getTradeNoRouting() {
        return tradeNoRouting;
    }

    public void setTradeNoRouting(String tradeNoRouting) {
        this.tradeNoRouting = tradeNoRouting == null ? null : tradeNoRouting.trim();
    }

    public int getFeeType() {
        return feeType;
    }

    public void setFeeType(int feeType) {
        this.feeType = feeType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getAssumePerson() {
        return assumePerson;
    }

    public void setAssumePerson(String assumePerson) {
        this.assumePerson = assumePerson == null ? null : assumePerson.trim();
    }

    public String getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(String templateNo) {
        this.templateNo = templateNo == null ? null : templateNo.trim();
    }

    public Integer getSlottingFeeAssumeer() {
        return slottingFeeAssumeer;
    }

    public void setSlottingFeeAssumeer(Integer slottingFeeAssumeer) {
        this.slottingFeeAssumeer = slottingFeeAssumeer;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeNoThird=").append(tradeNoThird);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", tradeNoRouting=").append(tradeNoRouting);
        sb.append(", feeType=").append(feeType);
        sb.append(", amount=").append(amount);
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", bizType=").append(bizType);
        sb.append(", assumePerson=").append(assumePerson);
        sb.append(", templateNo=").append(templateNo);
        sb.append(", slottingFeeAssumeer=").append(slottingFeeAssumeer);
        sb.append(", memo=").append(memo);
        sb.append(", extension=").append(extension);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}