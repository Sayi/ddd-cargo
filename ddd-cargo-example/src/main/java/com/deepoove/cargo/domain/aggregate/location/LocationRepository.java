package com.deepoove.cargo.domain.aggregate.location;

public interface LocationRepository {
    Location find(String code);
}
