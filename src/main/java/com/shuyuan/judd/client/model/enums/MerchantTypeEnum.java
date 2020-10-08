package com.shuyuan.judd.client.model.enums;

/**
 * @author Sting
 * create 2018/11/20

 **/
//商户类型枚举
public enum MerchantTypeEnum {
    PERSON(1, "个人商户","P"),
    INDIVIDUAL(2, "个体商户","I"),
    COMPANY(3, "企业商户","C");
    private int typeCode;
    private String typeName;
    /**
     * 商户类型简写，在生成商户号或订单号时，可以缩减位数
     */
    private String abbr;

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    MerchantTypeEnum(int typeCode, String typeName, String typeEnName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.abbr = typeEnName;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public static MerchantTypeEnum getTypeByCode(int code) {
        for (MerchantTypeEnum merchantTypeEnum : MerchantTypeEnum.values()) {
            if (merchantTypeEnum.getTypeCode() == code) {
                return merchantTypeEnum;
            }
        }
        return null;
    }
}
