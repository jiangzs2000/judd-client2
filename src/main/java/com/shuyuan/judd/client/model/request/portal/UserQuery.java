package com.shuyuan.judd.client.model.request.portal;

import lombok.Data;

@Data
public class UserQuery extends Query {
    private String startDate;
    private String endDate;
    private String search;
    private Long pid;
}
