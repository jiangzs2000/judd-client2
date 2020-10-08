package com.shuyuan.judd.client.model.request.portal.order;


import com.shuyuan.judd.client.model.request.portal.Query;
import lombok.Data;

import java.util.List;

@Data
public class WithdrawOrderQuery extends Query {
   /**
     * >= startDate 开始日期 YYYYMMDD
     */
    private String startDate;
    /**
     * < endDate 结束日期 YYYYMMDD
     */
    private String endDate;
    /**
     * 提现交易发起的商户号
     */
    private String merNo;

    private List<String> merNos;

    /**
     * 提现主体商户号
     */
    private String merchantNo;

    private String state;
}
