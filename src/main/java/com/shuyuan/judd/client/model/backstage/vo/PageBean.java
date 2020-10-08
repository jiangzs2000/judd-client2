package com.shuyuan.judd.client.model.backstage.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Sting
 * create 2017/05/19

 **/
//分页对象
@Data
public class PageBean<T> {
    //页码
    private int pageNum;
    //每页数量
    private int pageSize;
    //总数
    private int total;
    //每页数据
    private List<T> pageData;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getPageData() {
        return pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

    public void disposePageDate() {
        int startPage = (pageNum - 1) * pageSize;
        int endPage = startPage + pageSize;
        this.pageData = this.pageData.subList(startPage, endPage > total ? total : endPage);
    }
}
