package com.shuyuan.judd.client.model.request.portal;

import lombok.Data;

@Data
public class Query {
    /**
     * 第几页，从1开始
     */
    private Integer page = 0;
    /**
     * 每页包含的记录数
     */
    private Integer pageSize;

}
