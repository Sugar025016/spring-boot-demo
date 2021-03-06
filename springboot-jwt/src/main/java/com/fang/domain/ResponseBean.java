package com.fang.domain;

/**
 * @Author: fwj
 * @Description:
 * @Date: Created in 2018/11/7 14:13
 * @Modified by:
 */
public class ResponseBean {
    private int code;
    private String msg;
    private Object data;

    public ResponseBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
