package com.shuyuan.judd.client.model.enums;

/**
 * @author Boris
 * create 2019/01/17
 * 
 **/
public enum ExpireTimeEnum {

    NONE(0, "无固定期限"),
    ONE_SEC(1, "1秒钟"),
    FIVE_SEC(5, "5秒钟"),
    TEN_SEC(10, "10秒钟"),
    HALF_A_MIN(30, "30秒钟"),
    ONE_MIN(60, "1分钟"),
    THREE_MIN(180, "三分钟"),
    FIVE_MIN(300, "5分钟"),
    TEN_MIN(600, "10分钟"),
    TWENTY_MIN(1200, "20分钟"),
    HALF_AN_HOUR(1800, "30分钟"),
    ONE_HOUR(3600, "1小时"),
    ONE_DAY(86400, "1天"),
    ONE_MON(2592000, "1个月"),
    ONE_YEAR(31536000, "1年"),
    FIFTY_EIGHT_MIN(3480, "58分钟");

    private final int time;
    private final String desc;

    private ExpireTimeEnum(int time, String desc) {
        this.time = time;
        this.desc = desc;
    }

    public int getTime() {
        return this.time;
    }

    public String getDesc() {
        return this.desc;
    }

    public static ExpireTimeEnum match(int time) {
        if (NONE.getTime() == time) {
            return NONE;
        } else if (ONE_SEC.getTime() == time) {
            return ONE_SEC;
        } else if (FIVE_SEC.getTime() == time) {
            return FIVE_SEC;
        } else if (TEN_SEC.getTime() == time) {
            return TEN_SEC;
        } else if (HALF_A_MIN.getTime() == time) {
            return HALF_A_MIN;
        } else if (ONE_MIN.getTime() == time) {
            return ONE_MIN;
        } else if (THREE_MIN.getTime() == time) {
            return THREE_MIN;
        } else if (FIVE_MIN.getTime() == time) {
            return FIVE_MIN;
        } else if (TEN_MIN.getTime() == time) {
            return TEN_MIN;
        } else if (TWENTY_MIN.getTime() == time) {
            return TWENTY_MIN;
        } else if (HALF_AN_HOUR.getTime() == time) {
            return HALF_AN_HOUR;
        } else if (ONE_HOUR.getTime() == time) {
            return ONE_HOUR;
        } else if (ONE_DAY.getTime() == time) {
            return ONE_DAY;
        } else if (ONE_MON.getTime() == time) {
            return ONE_MON;
        } else if (ONE_YEAR.getTime() == time) {
            return ONE_YEAR;
        } else {
            return FIFTY_EIGHT_MIN.getTime() == time ? FIFTY_EIGHT_MIN : HALF_AN_HOUR;
        }
    }
}
