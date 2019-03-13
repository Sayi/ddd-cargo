package com.deepoove.cargo.infrastructure.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.deepoove.cargo.infrastructure.db.dataobject.AppConfig;

@Mapper
public interface CargoMapper {
    
    @Select("SELECT * FROM app_config WHERE name = #{id}")
    AppConfig find(@Param("id") String id);

}
