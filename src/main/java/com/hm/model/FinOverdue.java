package com.hm.model;

public class FinOverdue {
    private Long foid;

    private Long folid;

    private Long fofbid;

    private Long fofuid;

    private Long forid;

    private String foinfo;

    private Integer fostate;

    public FinOverdue(Long foid, Long folid, Long fofbid, Long fofuid, Long forid, String foinfo, Integer fostate) {
        this.foid = foid;
        this.folid = folid;
        this.fofbid = fofbid;
        this.fofuid = fofuid;
        this.forid = forid;
        this.foinfo = foinfo;
        this.fostate = fostate;
    }

    public FinOverdue() {
        super();
    }

    public Long getFoid() {
        return foid;
    }

    public void setFoid(Long foid) {
        this.foid = foid;
    }

    public Long getFolid() {
        return folid;
    }

    public void setFolid(Long folid) {
        this.folid = folid;
    }

    public Long getFofbid() {
        return fofbid;
    }

    public void setFofbid(Long fofbid) {
        this.fofbid = fofbid;
    }

    public Long getFofuid() {
        return fofuid;
    }

    public void setFofuid(Long fofuid) {
        this.fofuid = fofuid;
    }

    public Long getForid() {
        return forid;
    }

    public void setForid(Long forid) {
        this.forid = forid;
    }

    public String getFoinfo() {
        return foinfo;
    }

    public void setFoinfo(String foinfo) {
        this.foinfo = foinfo;
    }

    public Integer getFostate() {
        return fostate;
    }

    public void setFostate(Integer fostate) {
        this.fostate = fostate;
    }
}