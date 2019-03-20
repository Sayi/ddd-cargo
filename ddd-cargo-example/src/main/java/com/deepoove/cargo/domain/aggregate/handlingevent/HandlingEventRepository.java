package com.deepoove.cargo.domain.aggregate.handlingevent;

import java.util.List;

public interface HandlingEventRepository {

    List<HandlingEvent> findByCargo(String cargoId);

    List<HandlingEvent> findByScheduleId(String scheduleId);

    void save(HandlingEvent handlingEvent);

}
