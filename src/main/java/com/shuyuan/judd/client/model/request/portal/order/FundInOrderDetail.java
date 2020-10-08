package com.shuyuan.judd.client.model.request.portal.order;

import com.shuyuan.judd.client.model.order.FundInOrder;
import com.shuyuan.judd.client.model.order.PaymentTrace;
import lombok.Data;

import java.util.List;

@Data
public class FundInOrderDetail {
    private FundInOrder order;
    private List<PaymentTrace> payments;
}
