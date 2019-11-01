package com.hm.model;

public class Roles {
    private Long srid;

    private String srname;

    private Integer sravailable;

    private String srdescription;

    public Roles(Long srid, String srname, Integer sravailable, String srdescription) {
        this.srid = srid;
        this.srname = srname;
        this.sravailable = sravailable;
        this.srdescription = srdescription;
    }

    public Roles() {
        super();
    }

    public Long getSrid() {
        return srid;
    }

    public void setSrid(Long srid) {
        this.srid = srid;
    }

    public String getSrname() {
        return srname;
    }

    public void setSrname(String srname) {
        this.srname = srname;
    }

    public Integer getSravailable() {
        return sravailable;
    }

    public void setSravailable(Integer sravailable) {
        this.sravailable = sravailable;
    }

    public String getSrdescription() {
        return srdescription;
    }

    public void setSrdescription(String srdescription) {
        this.srdescription = srdescription;
    }
}