package com.hm.model;

public class AtteTel {
    private Long atid;

    private Long atufid;

    private String attel;

    private String atcode;

    private Integer atstate;

    private String atditor;

    public AtteTel(Long atid, Long atufid, String attel, String atcode, Integer atstate, String atditor) {
        this.atid = atid;
        this.atufid = atufid;
        this.attel = attel;
        this.atcode = atcode;
        this.atstate = atstate;
        this.atditor = atditor;
    }

    public AtteTel() {
        super();
    }

    public Long getAtid() {
        return atid;
    }

    public void setAtid(Long atid) {
        this.atid = atid;
    }

    public Long getAtufid() {
        return atufid;
    }

    public void setAtufid(Long atufid) {
        this.atufid = atufid;
    }

    public String getAttel() {
        return attel;
    }

    public void setAttel(String attel) {
        this.attel = attel;
    }

    public String getAtcode() {
        return atcode;
    }

    public void setAtcode(String atcode) {
        this.atcode = atcode;
    }

    public Integer getAtstate() {
        return atstate;
    }

    public void setAtstate(Integer atstate) {
        this.atstate = atstate;
    }

    public String getAtditor() {
        return atditor;
    }

    public void setAtditor(String atditor) {
        this.atditor = atditor;
    }
}