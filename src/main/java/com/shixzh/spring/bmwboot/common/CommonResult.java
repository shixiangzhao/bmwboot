package com.shixzh.spring.bmwboot.common;

import java.io.Serializable;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/7 0:07
 */
public class CommonResult<T> implements Serializable {

    private static final long serialVersionUID = 3713874654852996944L;

    private Integer code;
    private T data;
    private String msg;

    public CommonResult() {

    }

    public void setResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setResult(Integer code, String msg, T data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}