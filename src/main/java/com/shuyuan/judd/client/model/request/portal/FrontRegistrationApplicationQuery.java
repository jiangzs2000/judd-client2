package com.shuyuan.judd.client.model.request.portal;

import lombok.Data;

import java.util.List;

@Data
public class FrontRegistrationApplicationQuery extends Query {
    private List<String> createUsers;
    /**
     * YYYYMMDD
     */
    private String startDate;
    /**
     * YYYYMMDD
     */
    private String endDate;
    private String state;
    private String merSearch;
}
