package com.github.jarris3154.cloud.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.github.jarris3154.cloud.core.mapper")
public class MybatisPlusConfig {
}
