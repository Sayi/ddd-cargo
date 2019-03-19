package com.deepoove.cargo.infrastructure.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.deepoove.cargo.infrastructure.db.dataobject.AppConfig;
import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;

@Mapper
public interface CargoMapper {

    @Select("SELECT * FROM app_config WHERE name = #{id}")
    AppConfig findConfig(@Param("id") String id);

    @Select("SELECT * FROM cargo WHERE id = #{id}")
    CargoDO find(@Param("id") String id);

    @Select("SELECT * FROM cargo")
    List<CargoDO> findAll();

    @Select("SELECT * FROM cargo WHERE sender_id = #{customerId}")
    List<CargoDO> findByCustomerId(@Param("customerId") String customerId);

    @Insert("INSERT INTO `ddd_cargo` (`id`, `sender_id`, `description`, `originLocation_code`, `destinationLocation_code`, `created_at`)\n"
            + "VALUES (#{id}, #{senderId}, #{description}, #{originLocationCode}, #{destinationLocationCode}, now())")
    void save(CargoDO cargoDO);

}
