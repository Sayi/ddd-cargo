package com.deepoove.cargo.infrastructure.rpc.salessystem;

import org.springframework.stereotype.Component;

import com.deepoove.cargo.infrastructure.rpc.salessystem.dataobject.UserDO;

@Component
public class RemoteServiceTranslator {

    public UserDO toUserDO(Object obj) {
        return new UserDO();
    }

}
