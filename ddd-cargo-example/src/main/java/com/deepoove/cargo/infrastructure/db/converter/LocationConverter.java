package com.deepoove.cargo.infrastructure.db.converter;

import org.springframework.beans.BeanUtils;

import com.deepoove.cargo.domain.aggregate.location.Location;
import com.deepoove.cargo.infrastructure.db.dataobject.LocationDO;

public class LocationConverter {

    public static LocationDO serialize(Location location) {
        LocationDO target = new LocationDO();
        BeanUtils.copyProperties(location, target);
        return target;
    }

    public static Location deserialize(LocationDO locationDO) {
        Location target = new Location();
        BeanUtils.copyProperties(locationDO, target);
        return target;
    }

}
