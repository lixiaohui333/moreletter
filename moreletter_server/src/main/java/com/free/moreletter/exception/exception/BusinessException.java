package com.free.moreletter.exception.exception;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;

public class BusinessException extends BaseException {

    public BusinessException() {
        super(HttpCode.CODE_ERROR_BUSINESS,"已存在了");
    }

    public BusinessException(String msg) {
        super(HttpCode.CODE_ERROR_BUSINESS,msg);
    }
}
