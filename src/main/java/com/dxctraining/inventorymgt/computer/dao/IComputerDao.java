package com.dxctraining.inventorymgt.computer.dao;

import com.dxctraining.inventorymgt.computer.entities.Computer;

import java.util.List;

public interface IComputerDao {
    Computer addComputer(Computer computer);
    void removeComputer(int id);
    List<Computer> computerList();
    Computer findById(int id);
}
