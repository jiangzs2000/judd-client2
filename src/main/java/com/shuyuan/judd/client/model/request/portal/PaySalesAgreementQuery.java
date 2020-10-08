package com.shuyuan.judd.client.model.request.portal;

import lombok.Data;

import java.util.List;

@Data
public class PaySalesAgreementQuery extends Query {
    //开始日期
    private String startDate;
    //结束日期
    private String endDate;
    //搜索数据
    private String merSearch;
    //用户Id
    private List<String> createUsers;
}
