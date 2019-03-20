package com.deepoove.cargo.infrastructure.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.deepoove.cargo.infrastructure.db.dataobject.CarrierMovementDO;

@Mapper
public interface CarrierMovementMapper {

    CarrierMovementDO select(@Param("scheduleId") String scheduleId);

    List<CarrierMovementDO> selectAll();


}
