package com.shuyuan.judd.client.model.routing;

import lombok.Data;

import java.util.Map;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/6
 */
@Data
public class RoutingTemplateModel {

    //模板名称
    private String templateName;
    //分账设置
    private String routingSet;
    //费用承担方
    private String assumePerson;
    //创建时间
    private String createTime;
    //模板id
    private String routingId;
    //用户toekn
    private String token;
    //顺序
    private String routingSort;
    //所属商户
    private String merchantName;

    private Map<String, String> routingRate;

}
