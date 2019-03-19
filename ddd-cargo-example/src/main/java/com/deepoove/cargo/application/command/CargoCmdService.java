package com.deepoove.cargo.application.command;

import com.deepoove.cargo.application.command.cmd.CargoBookCommand;

public interface CargoCmdService {
    
    void bookCargo(CargoBookCommand cargoBookCommand);

}
