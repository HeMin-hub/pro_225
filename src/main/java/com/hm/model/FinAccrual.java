package com.hm.model;

public class FinAccrual {
    private Long faid;

    private Long fafsid;

    private Long famax;

    private Float faamount;

    public FinAccrual(Long faid, Long fafsid, Long famax, Float faamount) {
        this.faid = faid;
        this.fafsid = fafsid;
        this.famax = famax;
        this.faamount = faamount;
    }

    public FinAccrual() {
        super();
    }

    public Long getFaid() {
        return faid;
    }

    public void setFaid(Long faid) {
        this.faid = faid;
    }

    public Long getFafsid() {
        return fafsid;
    }

    public void setFafsid(Long fafsid) {
        this.fafsid = fafsid;
    }

    public Long getFamax() {
        return famax;
    }

    public void setFamax(Long famax) {
        this.famax = famax;
    }

    public Float getFaamount() {
        return faamount;
    }

    public void setFaamount(Float faamount) {
        this.faamount = faamount;
    }
}