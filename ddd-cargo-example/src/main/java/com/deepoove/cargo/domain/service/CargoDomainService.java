package com.deepoove.cargo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.handlingevent.HandlingEvent;
import com.deepoove.cargo.infrastructure.rpc.salessystem.SalersService;

@Service
public class CargoDomainService {

    public static final int MAX_CARGO_LIMIT = 10;

    @Autowired
    private SalersService salersService;

    public void updateCargoSender(Cargo cargo, String senderPhone, HandlingEvent latestEvent) {

        if (null != latestEvent
                && !latestEvent.canModifyCargo()) { throw new IllegalArgumentException(
                        "Sender cannot be changed after RECIEVER Status."); }

        cargo.changeSender(senderPhone);
    }

    public boolean mayAccept(int size, int cargoSize, Cargo cargo) {
        return size <= MAX_CARGO_LIMIT && salersService.mayAccept(cargoSize, cargo);
    }

}
