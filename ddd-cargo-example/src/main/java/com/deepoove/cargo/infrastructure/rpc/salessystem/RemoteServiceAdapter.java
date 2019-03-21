package com.deepoove.cargo.infrastructure.rpc.salessystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.infrastructure.rpc.salessystem.dataobject.UserDO;

@Component
public class RemoteServiceAdapter {

    @Autowired
    private RemoteServiceTranslator translator;

    // @Autowired
    // remoteService

    public UserDO getUser(String phone) {
        // User user = remoteService.getUser(phone);
        // return this.translator.toUserDO(user);
        return null;
    }

}
