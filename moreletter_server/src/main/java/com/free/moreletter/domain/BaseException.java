/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.domain;

import com.free.moreletter.conf.constants.HttpCode;

/**
 *
 * @author veniayang
 * @version $Id: BaseException.java, v 0.1 2019年02月24日 18:14 veniayang Exp $
 */
public class BaseException extends RuntimeException {
    
    public int code;

    public String msg;
    
    public BaseException() {
        super();
    }
    
    public BaseException(int code) {
        this.code = code;
    }
    
    public BaseException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public BaseException(Exception e) {
        super(e);
        
        this.code = HttpCode.CODE_ERROR_UNKNOWN;
        this.msg = e.getMessage();
    }


}