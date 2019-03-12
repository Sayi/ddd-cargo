package com.deepoove.cargo.infrastructure.rpc.salessystem;

import org.springframework.stereotype.Service;

import com.deepoove.cargo.domain.service.SalersService;


@Service
public class SalersServiceImpl implements SalersService{
    
    SalersSystemServiceAdapter adapter;

}
