package com.deepoove.cargo.domain.service;

import org.springframework.stereotype.Service;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEvent;

@Service
public class CargoDomainService {

    public static final int MAX_CARGO_LIMIT = 10;

    /**
     * 领域服务
     * 
     * @param cargo
     * @param senderPhone
     * @param latestEvent
     */
    public void updateCargoSender(Cargo cargo, String senderPhone, HandlingEvent latestEvent) {

        if (null != latestEvent
                && !latestEvent.canModifyCargo()) { throw new IllegalArgumentException(
                        "Sender cannot be changed after RECIEVER Status."); }

        cargo.changeSender(senderPhone);
    }

    public boolean canBook(int size) {
        return size <= MAX_CARGO_LIMIT;
    }

}
