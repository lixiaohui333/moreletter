package com.free.moreletter.exception;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;

public class TokenErrorException extends BaseException {

    public TokenErrorException() {
        super(HttpCode.CODE_ERROR_TOKEN,"token不合法");
    }

}
