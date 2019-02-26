package com.free.moreletter.exception;

public class BaseException  extends Exception{

    public String msg;

    public int code;

    public BaseException(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

}
