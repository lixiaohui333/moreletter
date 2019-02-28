package com.free.moreletter.exception.success;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;

public class SuccessException extends BaseException {

    public SuccessException() {
        super(HttpCode.CODE_SUCCESS,"操作成功");
    }
    public SuccessException(String msg) {
        super(HttpCode.CODE_SUCCESS,msg);
    }

}
