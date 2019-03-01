package com.free.moreletter.exception.success;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;
import com.free.moreletter.exception.ExceptionResult;

public class SuccessResult extends ExceptionResult {


    public SuccessResult(String msg) {
        super(msg, HttpCode.CODE_SUCCESS);
    }

    public SuccessResult() {
        super("操作成功", HttpCode.CODE_SUCCESS);
    }
}
