package com.shuyuan.judd.client.model.request.portal.order;

import com.shuyuan.judd.client.model.order.FundInOrder;
import com.shuyuan.judd.client.model.request.portal.QueryResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class FundInOrderQueryResult extends QueryResult {
    private List<FundInOrder> list;
    /**
     * 分
     */
    private BigDecimal totalAmount;
    private BigDecimal totalSettleAmt;
    private BigDecimal totalChannelCost;
}

