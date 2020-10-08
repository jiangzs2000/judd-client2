package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class FinishOrderResponse {
    /**
     * 创建订单时平台返回流水号
     */
    private String tradeNo;

    private List<Map<String, Object>> dividingResult;
}
