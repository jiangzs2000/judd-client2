package com.shuyuan.judd.client.model.backstage;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/2/28
 */
@Data
public class MerchantManagementVOModel {

    //所属商户信息
    private List<Map<String, String>> list;
    //聚多多——所属商户
    private List<MerchantDataModel> merchantDataModels;

    //数据总数
    private Integer count;
    //当前页数
    private Integer page;
    //总页数
    private Integer pages;
}
