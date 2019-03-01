package com.free.moreletter.dao.model;

import java.util.Date;

public class BaseDo  {

    private Date gmtCreate;
    private Date gmtModified;
    private String creator;
    private String state;

    public BaseDo() {
        creator="lxh";
        gmtCreate=new Date();
        gmtModified=new Date();
        state="ok";
    }

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
