package com.deepoove.cargo.application.service;

import com.deepoove.cargo.application.cmd.HandlingEventAddCommand;

public interface IncidentLoggingCmdService {

    void addHandlingEvent(HandlingEventAddCommand cmd);

}
