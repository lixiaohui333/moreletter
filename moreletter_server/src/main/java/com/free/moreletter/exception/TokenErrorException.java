package com.free.moreletter.exception;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;

public class IllegalParamsException extends BaseException {

    public IllegalParamsException() {
        super(HttpCode.CODE_ERROR_ILLEGAL,"非法参数");
    }

    public IllegalParamsException(String msg) {
        super(HttpCode.CODE_ERROR_ILLEGAL,msg);
    }
}
