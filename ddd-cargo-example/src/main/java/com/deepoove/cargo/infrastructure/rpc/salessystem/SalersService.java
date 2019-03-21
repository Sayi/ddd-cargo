package com.deepoove.cargo.infrastructure.rpc.salessystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.valueobject.EnterpriseSegment;
import com.deepoove.cargo.infrastructure.rpc.salessystem.dataobject.UserDO;

@Service
public class SalersService {

    @Autowired
    private RemoteServiceAdapter adapter;

    public String getUserName(String phone) {
        UserDO user = this.adapter.getUser(phone);
        return null == user ? null : user.getName();
    }

    public EnterpriseSegment deriveEnterpriseSegment(Cargo cargo) {
        return this.adapter.deriveEnterpriseSegment(cargo);
    }

    public boolean mayAccept(int cargoSize, Cargo cargo) {
        return this.adapter.mayAccept(cargoSize, cargo);
    }

}
