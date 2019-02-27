package com.free.moreletter.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class BaseVo extends ToString {

    @JsonIgnore
    private Date gmtCreate;
    @JsonIgnore
    private Date gmtModified;
    @JsonIgnore
    private String creator;
    @JsonIgnore
    private String state;

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
