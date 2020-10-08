package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.PaySalesAgreement;
import lombok.Data;

import java.util.List;

@Data
public class PaySalesAgreementQueryResult extends QueryResult {
    private List<PaySalesAgreement> list;
}
