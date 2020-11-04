package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.FrontRegistrationApplication;
import lombok.Data;

import java.util.List;

@Data
public class FrontRegistrationApplicationQueryResult extends QueryResult {
    private List<FrontRegistrationApplication> list;
}
