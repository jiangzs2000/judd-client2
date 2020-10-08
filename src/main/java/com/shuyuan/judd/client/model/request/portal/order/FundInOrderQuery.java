package com.shuyuan.judd.client.model.request.portal.order;

import com.shuyuan.judd.client.model.request.portal.Query;
import lombok.Data;

import java.util.List;

@Data
public class FundInOrderQuery extends Query {
    /**
     * >= startDate 开始日期 YYYYMMDD
     */
    private String startDate;
    /**
     * < endDate 结束日期 YYYYMMDD
     */
    private String endDate;
    private String merNo;
    /**
     * 查询商户号列表
     */
    private List<String> merNos;
    /**
     * 渠道
     */
    private String routingChannel;

    private String state;
}
