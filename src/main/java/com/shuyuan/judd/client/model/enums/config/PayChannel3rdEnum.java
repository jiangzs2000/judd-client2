package com.shuyuan.judd.client.model.enums.config;

/**
 * 定义引入的第三方渠道，同一个第三方机构可能会有多个渠道，渠道区分的标准是同一个商户是否需要重新进件。
 */
public enum PayChannel3rdEnum {
    LDLJ("LDLJ", "联动链金", Institution3rdEnum.LD);

    /**
     * 给通道定义一个唯一的编码，数据库中的值需要和这里一致
     */
    private String code;
    /**
     * 通道的名称
     */
    private String name;
    /**
     * 所属的三方机构
     */
    private Institution3rdEnum inst3rd;
    PayChannel3rdEnum(String code, String name, Institution3rdEnum inst3rd){
        this.code = code;
        this.name = name;
        this.inst3rd = inst3rd;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Institution3rdEnum getInst3rd() {
        return inst3rd;
    }

    public void setInst3rd(Institution3rdEnum inst3rd) {
        this.inst3rd = inst3rd;
    }
}
