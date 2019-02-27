package com.free.moreletter.exception;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ExceptionResult handle(Exception e) {
        if (e instanceof BaseException) {
            BaseException be = (BaseException) e;
            return new ExceptionResult(be.msg, be.code);
        } else {
            logger.error(e.getMessage());
            return new ExceptionResult("未知错误:" + e.getMessage(), HttpCode.CODE_ERROR_UNKNOWN);
        }
    }

}
