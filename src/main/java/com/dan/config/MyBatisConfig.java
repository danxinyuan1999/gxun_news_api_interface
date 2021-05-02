package com.dan.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置类
 *
 * @author dan
 */
@Configuration
@MapperScan("com.dan.mbg.mapper")
public class MyBatisConfig {

}
