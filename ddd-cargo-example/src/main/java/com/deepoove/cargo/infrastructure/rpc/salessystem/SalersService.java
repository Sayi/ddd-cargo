package com.deepoove.cargo.infrastructure.rpc.salessystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepoove.cargo.infrastructure.rpc.salessystem.dataobject.UserDO;

@Service
public class SalersService {

    @Autowired
    private RemoteServiceAdapter adapter;

    public String getUserName(String phone) {
        UserDO user = this.adapter.getUser(phone);
        return null == user ? null : user.getName();
    }

}
