package com.deepoove.cargo.infrastructure.db.converter;

import org.springframework.beans.BeanUtils;

import com.deepoove.cargo.domain.aggregate.handlingevent.EventTypeEnum;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEvent;
import com.deepoove.cargo.infrastructure.db.dataobject.HandlingEventDO;

public class HandlingEventConverter {

    public static HandlingEventDO serialize(HandlingEvent location) {
        HandlingEventDO target = new HandlingEventDO();
        BeanUtils.copyProperties(location, target);
        target.setEventType(location.eventType().index());
        return target;
    }

    public static HandlingEvent deserialize(HandlingEventDO locationDO) {
        HandlingEvent target = HandlingEvent.newHandlingEvent(locationDO.getCargoId(),
                locationDO.getDatetime(), EventTypeEnum.of(locationDO.getEventType()),
                locationDO.getScheduleId());
        return target;
    }

}
