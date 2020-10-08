package com.shuyuan.judd.client.model.request.portal.order;

import com.shuyuan.judd.client.model.order.FundInOrder;
import com.shuyuan.judd.client.model.order.PaymentTrace;
import lombok.Data;

@Data
public class PaymentTraceDetail {

    private PaymentTrace payment;
    private FundInOrder order;
}
