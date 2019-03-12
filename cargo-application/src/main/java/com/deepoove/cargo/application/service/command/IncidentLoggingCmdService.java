package com.deepoove.cargo.application.service.command;

import com.deepoove.cargo.application.cmd.HandlingEventCommand;

public interface IncidentLoggingCmdService {

    void addHandlingEvent(HandlingEventCommand cmd);

}
