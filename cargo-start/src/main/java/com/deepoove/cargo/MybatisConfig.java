package com.deepoove.cargo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.deepoove.cargo.infrastructure.db.mapper")
public class MybatisConfig {

}
