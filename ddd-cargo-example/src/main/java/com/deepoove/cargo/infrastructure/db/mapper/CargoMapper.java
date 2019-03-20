package com.deepoove.cargo.infrastructure.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.deepoove.cargo.infrastructure.db.dataobject.CargoDO;

@Mapper
public interface CargoMapper {

    CargoDO select(@Param("id") String id);

    List<CargoDO> selectAll();

    List<CargoDO> selectByCustomer(@Param("phone") String phone);

    void save(CargoDO cargoDO);

    void remove(@Param("id") String id);

    int countByCustomer(@Param("phone") String phone);

}
