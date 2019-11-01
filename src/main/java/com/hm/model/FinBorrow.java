package com.hm.model;

public class FinBorrow {
    private Long fbid;

    private Long fblid;

    private Float fbbidrequestamount;

    private Float fbcurrentrate;

    private Integer fbmonthes2retun;

    private Integer fbretruntype;

    private String fbtitle;

    private String fbdescription;

    public FinBorrow(Long fbid, Long fblid, Float fbbidrequestamount, Float fbcurrentrate, Integer fbmonthes2retun, Integer fbretruntype, String fbtitle, String fbdescription) {
        this.fbid = fbid;
        this.fblid = fblid;
        this.fbbidrequestamount = fbbidrequestamount;
        this.fbcurrentrate = fbcurrentrate;
        this.fbmonthes2retun = fbmonthes2retun;
        this.fbretruntype = fbretruntype;
        this.fbtitle = fbtitle;
        this.fbdescription = fbdescription;
    }

    public FinBorrow() {
        super();
    }

    public Long getFbid() {
        return fbid;
    }

    public void setFbid(Long fbid) {
        this.fbid = fbid;
    }

    public Long getFblid() {
        return fblid;
    }

    public void setFblid(Long fblid) {
        this.fblid = fblid;
    }

    public Float getFbbidrequestamount() {
        return fbbidrequestamount;
    }

    public void setFbbidrequestamount(Float fbbidrequestamount) {
        this.fbbidrequestamount = fbbidrequestamount;
    }

    public Float getFbcurrentrate() {
        return fbcurrentrate;
    }

    public void setFbcurrentrate(Float fbcurrentrate) {
        this.fbcurrentrate = fbcurrentrate;
    }

    public Integer getFbmonthes2retun() {
        return fbmonthes2retun;
    }

    public void setFbmonthes2retun(Integer fbmonthes2retun) {
        this.fbmonthes2retun = fbmonthes2retun;
    }

    public Integer getFbretruntype() {
        return fbretruntype;
    }

    public void setFbretruntype(Integer fbretruntype) {
        this.fbretruntype = fbretruntype;
    }

    public String getFbtitle() {
        return fbtitle;
    }

    public void setFbtitle(String fbtitle) {
        this.fbtitle = fbtitle;
    }

    public String getFbdescription() {
        return fbdescription;
    }

    public void setFbdescription(String fbdescription) {
        this.fbdescription = fbdescription;
    }
}