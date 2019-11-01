package com.hm.model;

public class FinWasteBook {
    private Long fwid;

    private Long fwlid;

    private Long fwfsid;

    private Long fwfbid;

    public FinWasteBook(Long fwid, Long fwlid, Long fwfsid, Long fwfbid) {
        this.fwid = fwid;
        this.fwlid = fwlid;
        this.fwfsid = fwfsid;
        this.fwfbid = fwfbid;
    }

    public FinWasteBook() {
        super();
    }

    public Long getFwid() {
        return fwid;
    }

    public void setFwid(Long fwid) {
        this.fwid = fwid;
    }

    public Long getFwlid() {
        return fwlid;
    }

    public void setFwlid(Long fwlid) {
        this.fwlid = fwlid;
    }

    public Long getFwfsid() {
        return fwfsid;
    }

    public void setFwfsid(Long fwfsid) {
        this.fwfsid = fwfsid;
    }

    public Long getFwfbid() {
        return fwfbid;
    }

    public void setFwfbid(Long fwfbid) {
        this.fwfbid = fwfbid;
    }
}