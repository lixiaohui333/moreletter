/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 *
 * @author veniayang
 * @version $Id: ToString.java, v 0.1 2019年02月24日 18:03 veniayang Exp $
 */
public abstract class ToString implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 5741211196365766155L;

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}