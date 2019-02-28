package com.free.moreletter.exception;

import com.free.moreletter.conf.constants.HttpCode;
import com.free.moreletter.domain.BaseException;
import com.free.moreletter.exception.exception.IllegalParamsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
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
        } else if (e instanceof BindException) {
//            ((BindException) e).getBindingResult().get
            BindException  bindE = (BindException) e;
            StringBuilder sb = new StringBuilder();
            for (FieldError error:bindE.getFieldErrors()){
                sb.append(error.getField()+":"+error.getDefaultMessage()+"  ");
            }
            return new ExceptionResult(sb.toString(), HttpCode.CODE_ERROR_ILLEGAL);
        } else {
            logger.error(e.getMessage());
            return new ExceptionResult("未知错误:" + e.getMessage(), HttpCode.CODE_ERROR_UNKNOWN);
        }
    }

}
