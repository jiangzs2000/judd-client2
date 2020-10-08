package com.shuyuan.judd.client.model.request.portal;

import lombok.Data;

import java.util.List;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/2/28
 */
@Data
public class MerchantQuery extends Query{

    //开始日期
    private String startDate;
    //结束日期
    private String endDate;
    //用户类型
    private String type;
    //所属商户
    private String pno;
    //搜索数据
    private String merSearch;

    //用户Id
    private List<String> createUsers;
    //用户名称
    private String merchantName;
    //提现模式
    private int withdrawDepositType;
}
