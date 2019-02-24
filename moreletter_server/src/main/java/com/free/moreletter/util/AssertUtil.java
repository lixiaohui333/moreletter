/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.util;

import com.free.moreletter.domain.BaseException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author veniayang
 * @version $Id: AssertUtil.java, v 0.1 2019年02月24日 18:17 veniayang Exp $
 */
public class AssertUtil {
    
    public static void notNull(Object obj, String msg) {
        if (obj == null) {
            throw new BaseException("Null Exception", msg);
        }
    }
    
    public static void nill(Object obj, String msg) {
        if (obj != null) {
            throw new BaseException("Not Null Exception", msg);
        }
    }
    
    public static void notBlank(String str, String msg) {
        if (StringUtils.isBlank(str)) {
            throw new BaseException("Blank String Exception", msg);
        }
    }
    
    public static void notEmpty(Collection col, String msg) {
        if (CollectionUtils.isEmpty(col)) {
            throw new BaseException("Empty Collection Exception", msg);
        }
    }
    
    public static void notEmpty(Map map, String msg) {
        if (CollectionUtils.isEmpty(map)) {
            throw new BaseException("Empty Map Exception", msg);
        }
    }
}