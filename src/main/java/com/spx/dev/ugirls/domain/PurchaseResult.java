package com.spx.dev.ugirls.domain;

public class PurchaseResult {

    /**
     * Status : 1
     * Msg : 订购成功!
     */

    private int Status;
    private String Msg;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }
}
