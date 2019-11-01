package com.hm.model;

public class Relation {
    private Long urid;

    private String urlinkman;

    private String urrealname;

    private String urtel;

    public Relation(Long urid, String urlinkman, String urrealname, String urtel) {
        this.urid = urid;
        this.urlinkman = urlinkman;
        this.urrealname = urrealname;
        this.urtel = urtel;
    }

    public Relation() {
        super();
    }

    public Long getUrid() {
        return urid;
    }

    public void setUrid(Long urid) {
        this.urid = urid;
    }

    public String getUrlinkman() {
        return urlinkman;
    }

    public void setUrlinkman(String urlinkman) {
        this.urlinkman = urlinkman;
    }

    public String getUrrealname() {
        return urrealname;
    }

    public void setUrrealname(String urrealname) {
        this.urrealname = urrealname;
    }

    public String getUrtel() {
        return urtel;
    }

    public void setUrtel(String urtel) {
        this.urtel = urtel;
    }
}