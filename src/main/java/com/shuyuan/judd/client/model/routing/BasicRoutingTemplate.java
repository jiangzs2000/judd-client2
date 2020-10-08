package com.shuyuan.judd.client.model.routing;

import java.io.Serializable;
import java.util.Date;

public class BasicRoutingTemplate implements Serializable {
    private Long id;

    private Integer userId;

    private String templateNo;

    private String templateName;

    private int routingType;

    private Integer routingSort;

    private Double routingSortRate;

    private Integer slottingFeeAssumeer;

    private Byte isUse;

    private String remark;

    private String extension;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    private Byte status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(String templateNo) {
        this.templateNo = templateNo == null ? null : templateNo.trim();
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public int getRoutingType() {
        return routingType;
    }

    public void setRoutingType(int routingType) {
        this.routingType = routingType;
    }

    public Integer getRoutingSort() {
        return routingSort;
    }

    public void setRoutingSort(Integer routingSort) {
        this.routingSort = routingSort;
    }

    public Double getRoutingSortRate() {
        return routingSortRate;
    }

    public void setRoutingSortRate(Double routingSortRate) {
        this.routingSortRate = routingSortRate;
    }

    public Integer getSlottingFeeAssumeer() {
        return slottingFeeAssumeer;
    }

    public void setSlottingFeeAssumeer(Integer assumPerson) {
        this.slottingFeeAssumeer = assumPerson;
    }

    public Byte getIsUse() {
        return isUse;
    }

    public void setIsUse(Byte isUse) {
        this.isUse = isUse;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", templateNo=").append(templateNo);
        sb.append(", templateName=").append(templateName);
        sb.append(", routingType=").append(routingType);
        sb.append(", routingSort=").append(routingSort);
        sb.append(", routingSortRate=").append(routingSortRate);
        sb.append(", slottingFeeAssumeer=").append(slottingFeeAssumeer);
        sb.append(", isUse=").append(isUse);
        sb.append(", remark=").append(remark);
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