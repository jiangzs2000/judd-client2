package com.shuyuan.judd.client.model.request.portal.order;

import com.shuyuan.judd.client.model.order.PaymentTrace;
import com.shuyuan.judd.client.model.request.portal.QueryResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PaymentQueryResult extends QueryResult {
    private List<PaymentTrace> list;
    /**
     * 分
     */
    private BigDecimal totalAmount;
    private BigDecimal totalSettleAmt;
}

