package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Boris
 * create 2018/10/15
 * 
 **/
@Data
public class ExcelDataModel implements Serializable {

    private static final long serialVersionUID = 1409585292972743405L;

    //商户名
    private String merchantName;
    //交易时间
    private String transactionTime;
    //交易汇总清单
    private List<TransactionSummaryModel> transactionSummaryModels;
    //交易对账明细
    private List<ReconciliationDetailsModel> reconciliationDetailsModels;

    //小计
    private String subtotal;

    //提现汇总清单
    private List<CashSummaryModel> cashSummaryModels;

    //提现对账明细
    private List<CashReconciliationDetailsModel> cashReconciliationDetailsModels;

    //汇总
    private String summary;
    //csv数据模型
    private List<CSVModel> csvModels;
    //判断是否为生成csv文件
    private Boolean flag;
}
