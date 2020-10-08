package com.shuyuan.judd.client.model.operationlog;

import lombok.Data;

/**
 * @author arvin
 * @date 2019-03-20 09:23
 */
@Data
public class OperationLogModel {
    //用户ID
    private String userId;
    //操作人
    private String userName;
    //操作模块
    private String operationModules;
    //操作字段
    private String operationField;
    //操作内容
    private String operationContent;
    //备注
    private String remark;
    //操作人id
    private Long createUser;
}
