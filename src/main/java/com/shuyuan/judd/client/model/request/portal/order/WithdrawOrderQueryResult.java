package com.shuyuan.judd.client.model.request.portal.order;

import com.shuyuan.judd.client.model.order.WithdrawOrder;
import com.shuyuan.judd.client.model.request.portal.Query;
import com.shuyuan.judd.client.model.request.portal.QueryResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class WithdrawOrderQueryResult extends QueryResult {
    private List<WithdrawOrder> list;
    /**
     * 分
     */
    private BigDecimal totalAmount;
    private BigDecimal totalPlatFeeAmt;
    private BigDecimal totalChannelFeeAmt;
    private BigDecimal totalChannelRetFeeAmt;
}

