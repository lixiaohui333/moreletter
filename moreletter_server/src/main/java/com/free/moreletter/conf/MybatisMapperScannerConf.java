/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.free.moreletter.conf;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author veniayang
 * @version $Id: MybatisMapperScannerConf.java, v 0.1 2019年02月24日 13:44 veniayang Exp $
 */
@Configuration
@AutoConfigureAfter(MybatisConf.class)
public class MybatisMapperScannerConf {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.free.moreletter.dao.mapper");
        return mapperScannerConfigurer;
    }
    
}