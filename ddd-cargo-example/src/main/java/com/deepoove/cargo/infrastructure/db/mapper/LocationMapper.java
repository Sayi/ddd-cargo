package com.deepoove.cargo.infrastructure.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;

@Mapper
public interface LocationMapper {

    LocationDO select(@Param("code") String code);

    List<LocationDO> selectAll();


}
