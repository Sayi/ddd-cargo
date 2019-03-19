package com.deepoove.cargo.infrastructure.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.deepoove.cargo.infrastructure.db.dataobject.AppConfig;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;

@Mapper
public interface CargoMapper {
    
//    @Select("SELECT * FROM app_config WHERE name = #{id}")
//    AppConfig find(@Param("id") String id);
    
    
    @Select("SELECT * FROM cargo WHERE id = #{id}")
    CargoDO find(@Param("id") String id);

}
