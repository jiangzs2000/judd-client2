package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.Merchant;
import lombok.Data;

import java.util.List;
@Data
public class MerchantQueryResult extends QueryResult {
    private List<Merchant> list;
}
