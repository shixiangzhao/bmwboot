package com.shixzh.spring.bmw.constants;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/7 8:51
 */
public enum ResultCode {

    SUCCESS(200, "Request Success"),
    SERVER_ERROR(200, "Server Error");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}