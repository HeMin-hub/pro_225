package com.hm.model;

public class Account {
    private Long uaid;

    private String tradepassword;

    private String salt;

    private Float usableamount;

    private Float freezedamount;

    private Float unreceiveinterest;

    private Float unreceiveprincipal;

    private Float unreturnamount;

    private Integer remainborrowlimit;

    private Integer borrowlimit;

    public Account(Long uaid, String tradepassword, String salt, Float usableamount, Float freezedamount, Float unreceiveinterest, Float unreceiveprincipal, Float unreturnamount, Integer remainborrowlimit, Integer borrowlimit) {
        this.uaid = uaid;
        this.tradepassword = tradepassword;
        this.salt = salt;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
        this.unreceiveinterest = unreceiveinterest;
        this.unreceiveprincipal = unreceiveprincipal;
        this.unreturnamount = unreturnamount;
        this.remainborrowlimit = remainborrowlimit;
        this.borrowlimit = borrowlimit;
    }

    public Account() {
        super();
    }

    public Long getUaid() {
        return uaid;
    }

    public void setUaid(Long uaid) {
        this.uaid = uaid;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Float getUsableamount() {
        return usableamount;
    }

    public void setUsableamount(Float usableamount) {
        this.usableamount = usableamount;
    }

    public Float getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(Float freezedamount) {
        this.freezedamount = freezedamount;
    }

    public Float getUnreceiveinterest() {
        return unreceiveinterest;
    }

    public void setUnreceiveinterest(Float unreceiveinterest) {
        this.unreceiveinterest = unreceiveinterest;
    }

    public Float getUnreceiveprincipal() {
        return unreceiveprincipal;
    }

    public void setUnreceiveprincipal(Float unreceiveprincipal) {
        this.unreceiveprincipal = unreceiveprincipal;
    }

    public Float getUnreturnamount() {
        return unreturnamount;
    }

    public void setUnreturnamount(Float unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    public Integer getRemainborrowlimit() {
        return remainborrowlimit;
    }

    public void setRemainborrowlimit(Integer remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
    }

    public Integer getBorrowlimit() {
        return borrowlimit;
    }

    public void setBorrowlimit(Integer borrowlimit) {
        this.borrowlimit = borrowlimit;
    }
}