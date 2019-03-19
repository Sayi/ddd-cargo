package com.deepoove.cargo.application.command;

import com.deepoove.cargo.application.command.cmd.HandlingEventAddCommand;

public interface IncidentLoggingCmdService {

    void addHandlingEvent(HandlingEventAddCommand cmd);

}
