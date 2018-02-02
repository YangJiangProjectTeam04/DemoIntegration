package com.xiaohei.domain;

public class StudentParameter {

    private String username;

    private int pageIndex;

    private int pageSize;

    public StudentParameter() {
    }

    public StudentParameter(String username, int pageIndex, int pageSize) {
        this.username = username;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
