package com.hm.model;

public class AtteBank {
    private Long abid;

    private Long asid;

    private Long abufid;

    private String abankcard;

    private String abtype;

    private Integer abstate;

    private String abditor;

    public AtteBank(Long abid, Long asid, Long abufid, String abankcard, String abtype, Integer abstate, String abditor) {
        this.abid = abid;
        this.asid = asid;
        this.abufid = abufid;
        this.abankcard = abankcard;
        this.abtype = abtype;
        this.abstate = abstate;
        this.abditor = abditor;
    }

    public AtteBank() {
        super();
    }

    public Long getAbid() {
        return abid;
    }

    public void setAbid(Long abid) {
        this.abid = abid;
    }

    public Long getAsid() {
        return asid;
    }

    public void setAsid(Long asid) {
        this.asid = asid;
    }

    public Long getAbufid() {
        return abufid;
    }

    public void setAbufid(Long abufid) {
        this.abufid = abufid;
    }

    public String getAbankcard() {
        return abankcard;
    }

    public void setAbankcard(String abankcard) {
        this.abankcard = abankcard;
    }

    public String getAbtype() {
        return abtype;
    }

    public void setAbtype(String abtype) {
        this.abtype = abtype;
    }

    public Integer getAbstate() {
        return abstate;
    }

    public void setAbstate(Integer abstate) {
        this.abstate = abstate;
    }

    public String getAbditor() {
        return abditor;
    }

    public void setAbditor(String abditor) {
        this.abditor = abditor;
    }
}