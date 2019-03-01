package com.free.moreletter.exception.success;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.exception.ExceptionResult;

public class ErrorResult extends ExceptionResult {


    public ErrorResult(String msg) {
        super(msg, HttpCode.CODE_ERROR_UNKNOWN);
    }

    public ErrorResult() {
        super("操作失败", HttpCode.CODE_ERROR_UNKNOWN);
    }
}
