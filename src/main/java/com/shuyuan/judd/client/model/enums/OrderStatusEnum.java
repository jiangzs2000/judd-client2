package com.shuyuan.judd.client.model.enums;
/**
 * Created by Kevin
 * description: 订单状态
 * date: 2018/11/23 1:35 PM
 */
@Deprecated
public enum OrderStatusEnum {
    S("S", "成功"),
    P("P", "处理中"),
    F("F", "失败");
    private String code;
    private String msg;

    OrderStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static OrderStatusEnum getEnumByKey(String key){
        if(null == key){
            return null;
        }
        for(OrderStatusEnum temp: OrderStatusEnum.values()){
            if(temp.getCode().equals(key)){
                return temp;
            }
        }
        return null;
    }
}
