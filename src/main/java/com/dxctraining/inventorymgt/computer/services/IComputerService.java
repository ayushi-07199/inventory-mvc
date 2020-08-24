package com.dxctraining.inventorymgt.computer.services;

import com.dxctraining.inventorymgt.computer.entities.Computer;

import java.util.List;

public interface IComputerService {
    Computer addComputer(Computer computer);
    void removeComputer(int id);
    List<Computer> computerList();
    Computer findById(int id);
}
