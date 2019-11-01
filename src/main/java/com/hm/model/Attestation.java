package com.hm.model;

public class Attestation {
    private Long uatid;

    private Integer astatus;

    private Integer atel;

    private Integer aemail;

    private Integer abank;

    private Integer amaterials;

    public Attestation(Long uatid, Integer astatus, Integer atel, Integer aemail, Integer abank, Integer amaterials) {
        this.uatid = uatid;
        this.astatus = astatus;
        this.atel = atel;
        this.aemail = aemail;
        this.abank = abank;
        this.amaterials = amaterials;
    }

    public Attestation() {
        super();
    }

    public Long getUatid() {
        return uatid;
    }

    public void setUatid(Long uatid) {
        this.uatid = uatid;
    }

    public Integer getAstatus() {
        return astatus;
    }

    public void setAstatus(Integer astatus) {
        this.astatus = astatus;
    }

    public Integer getAtel() {
        return atel;
    }

    public void setAtel(Integer atel) {
        this.atel = atel;
    }

    public Integer getAemail() {
        return aemail;
    }

    public void setAemail(Integer aemail) {
        this.aemail = aemail;
    }

    public Integer getAbank() {
        return abank;
    }

    public void setAbank(Integer abank) {
        this.abank = abank;
    }

    public Integer getAmaterials() {
        return amaterials;
    }

    public void setAmaterials(Integer amaterials) {
        this.amaterials = amaterials;
    }
}