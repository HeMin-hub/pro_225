package com.hm.model;

public class Materials {
    private Long amid;

    private String amname;

    private String amtype;

    private String amurl;

    private Integer amrscore;

    private String amremark;

    public Materials(Long amid, String amname, String amtype, String amurl, Integer amrscore, String amremark) {
        this.amid = amid;
        this.amname = amname;
        this.amtype = amtype;
        this.amurl = amurl;
        this.amrscore = amrscore;
        this.amremark = amremark;
    }

    public Materials() {
        super();
    }

    public Long getAmid() {
        return amid;
    }

    public void setAmid(Long amid) {
        this.amid = amid;
    }

    public String getAmname() {
        return amname;
    }

    public void setAmname(String amname) {
        this.amname = amname;
    }

    public String getAmtype() {
        return amtype;
    }

    public void setAmtype(String amtype) {
        this.amtype = amtype;
    }

    public String getAmurl() {
        return amurl;
    }

    public void setAmurl(String amurl) {
        this.amurl = amurl;
    }

    public Integer getAmrscore() {
        return amrscore;
    }

    public void setAmrscore(Integer amrscore) {
        this.amrscore = amrscore;
    }

    public String getAmremark() {
        return amremark;
    }

    public void setAmremark(String amremark) {
        this.amremark = amremark;
    }
}