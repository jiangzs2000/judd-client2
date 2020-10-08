package com.shuyuan.judd.client.model.config;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kevin
 * description:节假日
 * date: 2018/10/23 10:50 AM
 */
@Data
public class ConfigHolidaysModel implements Serializable {
    private static final long serialVersionUID = 4177145630737516728L;
    private int id;
    //节假日时间
    private String holidayTime;
    //假日标识
    private String holidayFlag;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
    private int status;

}
