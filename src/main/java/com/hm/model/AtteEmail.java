package com.hm.model;

public class AtteEmail {
    private Long aeid;

    private Long aeufid;

    private String aemail;

    private String aecode;

    private Integer aestate;

    private String aeditor;

    public AtteEmail(Long aeid, Long aeufid, String aemail, String aecode, Integer aestate, String aeditor) {
        this.aeid = aeid;
        this.aeufid = aeufid;
        this.aemail = aemail;
        this.aecode = aecode;
        this.aestate = aestate;
        this.aeditor = aeditor;
    }

    public AtteEmail() {
        super();
    }

    public Long getAeid() {
        return aeid;
    }

    public void setAeid(Long aeid) {
        this.aeid = aeid;
    }

    public Long getAeufid() {
        return aeufid;
    }

    public void setAeufid(Long aeufid) {
        this.aeufid = aeufid;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public String getAecode() {
        return aecode;
    }

    public void setAecode(String aecode) {
        this.aecode = aecode;
    }

    public Integer getAestate() {
        return aestate;
    }

    public void setAestate(Integer aestate) {
        this.aestate = aestate;
    }

    public String getAeditor() {
        return aeditor;
    }

    public void setAeditor(String aeditor) {
        this.aeditor = aeditor;
    }
}