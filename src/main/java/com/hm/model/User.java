package com.hm.model;

import java.util.Date;

public class User {
    private Long ulid;

    private Integer ulbitstate;

    private String ulname;

    private String ulpassword;

    private String ulsalt;

    private Long uaid;

    private Long ufid;

    private Long uatid;

    private Date ulcreatedate;

    public User(Long ulid, Integer ulbitstate, String ulname, String ulpassword, String ulsalt, Long uaid, Long ufid, Long uatid, Date ulcreatedate) {
        this.ulid = ulid;
        this.ulbitstate = ulbitstate;
        this.ulname = ulname;
        this.ulpassword = ulpassword;
        this.ulsalt = ulsalt;
        this.uaid = uaid;
        this.ufid = ufid;
        this.uatid = uatid;
        this.ulcreatedate = ulcreatedate;
    }

    public User() {
        super();
    }

    public Long getUlid() {
        return ulid;
    }

    public void setUlid(Long ulid) {
        this.ulid = ulid;
    }

    public Integer getUlbitstate() {
        return ulbitstate;
    }

    public void setUlbitstate(Integer ulbitstate) {
        this.ulbitstate = ulbitstate;
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        this.ulname = ulname;
    }

    public String getUlpassword() {
        return ulpassword;
    }

    public void setUlpassword(String ulpassword) {
        this.ulpassword = ulpassword;
    }

    public String getUlsalt() {
        return ulsalt;
    }

    public void setUlsalt(String ulsalt) {
        this.ulsalt = ulsalt;
    }

    public Long getUaid() {
        return uaid;
    }

    public void setUaid(Long uaid) {
        this.uaid = uaid;
    }

    public Long getUfid() {
        return ufid;
    }

    public void setUfid(Long ufid) {
        this.ufid = ufid;
    }

    public Long getUatid() {
        return uatid;
    }

    public void setUatid(Long uatid) {
        this.uatid = uatid;
    }

    public Date getUlcreatedate() {
        return ulcreatedate;
    }

    public void setUlcreatedate(Date ulcreatedate) {
        this.ulcreatedate = ulcreatedate;
    }
}