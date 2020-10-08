package com.shuyuan.judd.client.model.request.portal.order;

import com.shuyuan.judd.client.model.order.RefundOrder;
import com.shuyuan.judd.client.model.order.WithdrawOrder;
import com.shuyuan.judd.client.model.request.portal.Query;
import com.shuyuan.judd.client.model.request.portal.QueryResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class RefundOrderQueryResult extends QueryResult {
    private List<RefundOrder> list;
    /**
     * 分
     */
    private BigDecimal totalAmount;
    private BigDecimal totalFeeAmount;
}

