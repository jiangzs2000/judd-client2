package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.RegistrationApplication;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationApplicationQueryResult extends QueryResult {
    private List<RegistrationApplication> list;
}
