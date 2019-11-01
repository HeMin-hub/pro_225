package com.hm.model;

public class AtteStatus {
    private Long asid;

    private Long asufid;

    private String asidcardno;

    private String asidaddress;

    private String asidimg;

    private Integer asstate;

    private String asditor;

    public AtteStatus(Long asid, Long asufid, String asidcardno, String asidaddress, String asidimg, Integer asstate, String asditor) {
        this.asid = asid;
        this.asufid = asufid;
        this.asidcardno = asidcardno;
        this.asidaddress = asidaddress;
        this.asidimg = asidimg;
        this.asstate = asstate;
        this.asditor = asditor;
    }

    public AtteStatus() {
        super();
    }

    public Long getAsid() {
        return asid;
    }

    public void setAsid(Long asid) {
        this.asid = asid;
    }

    public Long getAsufid() {
        return asufid;
    }

    public void setAsufid(Long asufid) {
        this.asufid = asufid;
    }

    public String getAsidcardno() {
        return asidcardno;
    }

    public void setAsidcardno(String asidcardno) {
        this.asidcardno = asidcardno;
    }

    public String getAsidaddress() {
        return asidaddress;
    }

    public void setAsidaddress(String asidaddress) {
        this.asidaddress = asidaddress;
    }

    public String getAsidimg() {
        return asidimg;
    }

    public void setAsidimg(String asidimg) {
        this.asidimg = asidimg;
    }

    public Integer getAsstate() {
        return asstate;
    }

    public void setAsstate(Integer asstate) {
        this.asstate = asstate;
    }

    public String getAsditor() {
        return asditor;
    }

    public void setAsditor(String asditor) {
        this.asditor = asditor;
    }
}