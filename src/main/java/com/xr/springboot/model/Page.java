package com.xr.springboot.model;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
    private int currPageNo; // 当前页码
    private int pageSize; // 页面大小，即每页显示记录数
    private int totalCount; // 记录总数
    private int totalPageCount; // 总页数
    private List<User> newsList; // 每页数据集合
    public int getCurrPageNo() {
        return currPageNo;
    }
    public void setCurrPageNo(int currPageNo) {
        this.currPageNo = currPageNo;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public int getTotalPageCount() {
        return totalPageCount;
    }
    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
    public List<User> getNewsList() {
        return newsList;
    }
    public void setNewsList(List<User> newsList) {
        this.newsList = newsList;
    }
    public Page(int currPageNo, int pageSize, int totalCount,
                int totalPageCount, List<User> newsList) {
        super();
        this.currPageNo = currPageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPageCount = totalPageCount;
        this.newsList = newsList;
    }



}
