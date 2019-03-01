package com.free.moreletter.exception.exception;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;

public class PhoneExistException extends BaseException {

    public PhoneExistException() {
        super(HttpCode.CODE_ERROR_PHONE_EXIST,"用户已经存在");
    }

    public PhoneExistException(String msg) {
        super(HttpCode.CODE_ERROR_ILLEGAL,msg);
    }
}
