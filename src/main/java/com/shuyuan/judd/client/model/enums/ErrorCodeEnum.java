package com.shuyuan.judd.client.model.enums;

/**
 * Created by Kevin
 * description: 1.（平台错误码 此号以此累加） 2.（机构错误码按照联动）
 * date: 2018/11/23 1:35 PM
 */
public enum ErrorCodeEnum {
    FUNDOUT_INIT("0", "初始"),
    FUNDOUT_SUCCESS("1", "成功"),
    FUNDOUT_FAIL("2", "失败"),
    FUNDOUT_PROCESS("3", "处理中"),
    FUNDOUT_CLOSE("4", "交易关闭"),
    SYSTEM_ERROR("-1", "系统错误"),
    /*修改联动错误码中文*/
    IDENTITY_CODE_ERROR("00461001", "亲! 请检查身份证号信息是否正确"),


    /*内部的*/
    AMOUNT_NOT_DEMAND("00080705", "金额小于5元不能提现"),
    DATABASE_QUERY_ERROR("00080706", "数据库查询错误"),
    NOT_FUNDOUT_ERROR("00080707", "对公节假日或双休日不能出款"),
    NON_SUPPORT_FASTPAY_CR("00080708", "快捷支付暂不支持贷记卡"),
    CARD_BIN_NOMATCH("00080709", "亲! 请检查卡号信息是否正确"),
    VIRTUAL_CREADER_ORDER("00080710", "创建虚拟订单失败"),
    SMS_VERIFY_ERROR("00080711", "短信验证码发送失败"),
    SMS_VERIFY_CODE_ERROR("00080712", "短信验证码校验失败"),
    VERIFY_CAPTCHA_CODE_ERROR("00080713", "图文验证码校验失败"),
    TOKEN_VERIFY_ERROR("00080714", "token校验失败"),
    USER_DOSE_NOT_EXIST("00080715", "用户不存在"),
    PASSWORD_ERROR("00080716", "密码错误"),
    IDENTITY_CODE_FIRST_ERROR("00080717", "亲!请检查身份证号是否正确"),
    IDENTITY_NAME_FIRST_ERROR("00080718", "亲!请检查姓名是否正确"),
    UNBIND_CARD_BIND_BANK_INFO_ERROR("00080719", "解绑失败"),
    MERCHANT_NOT_OWN("00080720", "分账方不是商户所属子商户"),
    SUB_ACCOUNT_NUMBER_NOT("00080721", "分账方数量不相同"),
    PAY_ORDER_EXISTED("00080722", "payOrderId已存在"),
    ASSUMEPERSON_ERROR("00080723", "分账通道费选择错误"),
    EBANKS_GATEID_ISNULL_ERROR("00080724", "亲!网银支付gateId不能为空"),
    SYSTEM_OPERATION_LOGS_ERR("00080725", "亲系统操作日志添加失败"),
    NEW_PASSWORD_EQUALLY_OLD("00080726", "新老密码相同"),
    PASSWORD_FORMAT_ERROR("00080727", "密码格式不正确"),
    B_AND_H_NOT_FUNDOUT_ERROR("00080729","亲!对公节假日不能出款"),
    PAYORDERID_NO_EXISTENT("00080728", "payOrderId不存在"),
    REFUND_FEE_FAILD("00080729", "退款失败"),
    REFUND_FEE_AMOUNT_FAILD("00080730","退费金额不正确"),
    REFUND_ORDER_ID_EXISTED("00080731","refundOrderId已存在");
    private String code;
    private String msg;

    ErrorCodeEnum(String code, String msg) {
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

    public static ErrorCodeEnum getEnumByKey(String key) {
        if (null == key) {
            return null;
        }
        for (ErrorCodeEnum temp : ErrorCodeEnum.values()) {
            if (temp.getCode().equals(key)) {
                return temp;
            }
        }
        return null;
    }
}
