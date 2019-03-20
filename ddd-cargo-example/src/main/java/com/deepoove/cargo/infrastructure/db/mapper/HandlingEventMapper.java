package com.deepoove.cargo.infrastructure.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.deepoove.cargo.infrastructure.db.dataobject.HandlingEventDO;

@Mapper
public interface HandlingEventMapper {

    List<HandlingEventDO> selectByCargo(@Param("cargoId") String cargoId);

    List<HandlingEventDO> selectByScheduleId(@Param("scheduleId") String scheduleId);

    void save(HandlingEventDO handlingEventDO);

}
