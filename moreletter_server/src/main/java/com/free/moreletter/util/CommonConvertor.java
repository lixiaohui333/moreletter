/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.util;

import org.springframework.cglib.beans.BeanCopier;

/**
 *
 * @author veniayang
 * @version $Id: CommonConvertor.java, v 0.1 2019年02月24日 18:26 veniayang Exp $
 */
public class CommonConvertor {
    
    public static void convert(Object source, Object target) {
        if (source == null || target == null) {
            return;
        }
        
        BeanCopier copier = BeanCopier.create(source.getClass(), target.getClass(), false);
        copier.copy(source, target, null);
    }
    
}