/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.domain;

/**
 *
 * @author veniayang
 * @version $Id: BaseException.java, v 0.1 2019年02月24日 18:14 veniayang Exp $
 */
public class BaseException extends RuntimeException {
    
    String code;
    
    String msg;
    
    public BaseException() {
        super();
    }
    
    public BaseException(String code) {
        super(code);
        
        this.code = code;
    }
    
    public BaseException(String code, String msg) {
        super(code);
        
        this.code = code;
        this.msg = msg;
    }
    
    public BaseException(Exception e) {
        super(e);
        
        this.code = "Sever Base Exception";
        this.msg = e.getMessage();
    }
    
}