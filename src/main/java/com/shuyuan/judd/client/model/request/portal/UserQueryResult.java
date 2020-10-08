package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.User;
import lombok.Data;

import java.util.List;

@Data
public class UserQueryResult extends QueryResult {
    private List<User> list;
}
