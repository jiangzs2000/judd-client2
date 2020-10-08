package com.shuyuan.judd.client.model.backstage.vo;

import lombok.Data;

/**
 * @author Sting
 * create 2019/04/01

 **/
@Data
public class BelongMerchantsListModel {
    //所属商户id
    private String userId;
    //所属商户名称
    private String merchantName;

    public BelongMerchantsListModel() {

    }

    public BelongMerchantsListModel(String userId, String merchantName) {
        this.userId = userId;
        this.merchantName = merchantName;
    }
}
