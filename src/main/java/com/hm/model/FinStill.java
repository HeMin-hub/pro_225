package com.hm.model;

import java.util.Date;

public class FinStill {
    private Long fsid;

    private Long fslid;

    private Long fsfbid;

    private Float fsstillamount;

    private Float fsexcessamount;

    private Date fsfbtime;

    private Date fstime;

    public FinStill(Long fsid, Long fslid, Long fsfbid, Float fsstillamount, Float fsexcessamount, Date fsfbtime, Date fstime) {
        this.fsid = fsid;
        this.fslid = fslid;
        this.fsfbid = fsfbid;
        this.fsstillamount = fsstillamount;
        this.fsexcessamount = fsexcessamount;
        this.fsfbtime = fsfbtime;
        this.fstime = fstime;
    }

    public FinStill() {
        super();
    }

    public Long getFsid() {
        return fsid;
    }

    public void setFsid(Long fsid) {
        this.fsid = fsid;
    }

    public Long getFslid() {
        return fslid;
    }

    public void setFslid(Long fslid) {
        this.fslid = fslid;
    }

    public Long getFsfbid() {
        return fsfbid;
    }

    public void setFsfbid(Long fsfbid) {
        this.fsfbid = fsfbid;
    }

    public Float getFsstillamount() {
        return fsstillamount;
    }

    public void setFsstillamount(Float fsstillamount) {
        this.fsstillamount = fsstillamount;
    }

    public Float getFsexcessamount() {
        return fsexcessamount;
    }

    public void setFsexcessamount(Float fsexcessamount) {
        this.fsexcessamount = fsexcessamount;
    }

    public Date getFsfbtime() {
        return fsfbtime;
    }

    public void setFsfbtime(Date fsfbtime) {
        this.fsfbtime = fsfbtime;
    }

    public Date getFstime() {
        return fstime;
    }

    public void setFstime(Date fstime) {
        this.fstime = fstime;
    }
}