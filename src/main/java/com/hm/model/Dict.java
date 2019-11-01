package com.hm.model;

public class Dict {
    private Long did;

    private String dtype;

    private String dcontent;

    private Integer dstate;

    public Dict(Long did, String dtype, String dcontent, Integer dstate) {
        this.did = did;
        this.dtype = dtype;
        this.dcontent = dcontent;
        this.dstate = dstate;
    }

    public Dict() {
        super();
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDcontent() {
        return dcontent;
    }

    public void setDcontent(String dcontent) {
        this.dcontent = dcontent;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }
}