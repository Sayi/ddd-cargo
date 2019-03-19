package com.deepoove.cargo.domain.aggregate.handlingevent;

import java.util.List;

public interface HandlingEventRepository {

    void save(HandlingEvent handlingEvent);

    List<HandlingEvent> findByCargo(String cargoId);

    List<HandlingEvent> findByScheduleId(String scheduleId);

}
