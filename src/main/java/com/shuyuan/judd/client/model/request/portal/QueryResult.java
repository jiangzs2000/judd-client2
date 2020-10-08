package com.shuyuan.judd.client.model.request.portal;

import lombok.Data;

@Data
public class QueryResult {
    private Long count = 0L;
    /**
     * null：代表不分页
     */
    private Integer pageCount = 0;
    /**
     * null：代表不分页
     */
    private Integer page = 0;
}
