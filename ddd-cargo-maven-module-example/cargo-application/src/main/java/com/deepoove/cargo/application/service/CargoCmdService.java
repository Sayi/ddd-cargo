package com.deepoove.cargo.application.service;

import com.deepoove.cargo.application.cmd.CargoBookCommand;

public interface CargoCmdService {
    
    void bookCargo(CargoBookCommand cargoBookCommand);

}
