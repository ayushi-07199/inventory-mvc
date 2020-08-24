package com.dxctraining.inventorymgt.computer.services;


import com.dxctraining.inventorymgt.computer.dao.IComputerDao;
import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.item.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ComputerServiceImplementation implements IComputerService {

    @Autowired
    private IComputerDao computerDao;

    @Override
    public Computer addComputer(Computer computer) {
        computerDao.addComputer(computer);
        return computer;
    }

    @Override
    public void removeComputer(int id) {
      validateId(id);
      computerDao.removeComputer(id);
    }

    private void validateId(int id) {
        if(id<0)
        {
            throw new InvalidArgumentException("ID CANT BE NULL AND NEGATIVE");
        }
    }

    @Override
    public List<Computer> computerList() {
        List<Computer>result=computerDao.computerList();
        return result;
    }

    @Override
    public Computer findById(int id) {
        validateId(id);
        Computer computer=computerDao.findById(id);
        return computer;
    }
}
