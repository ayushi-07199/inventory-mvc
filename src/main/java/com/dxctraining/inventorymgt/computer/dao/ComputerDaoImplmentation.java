package com.dxctraining.inventorymgt.computer.dao;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.exceptions.ComputerNotFoundException;
import com.dxctraining.inventorymgt.item.entities.Item;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class ComputerDaoImplmentation implements IComputerDao{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Computer addComputer(Computer computer) {
        entityManager.persist(computer);
        return computer;
    }

    @Override
    public void removeComputer(int id) {
    entityManager.remove(id);
    }

    @Override
    public List<Computer> computerList() {
        String jpaql="from Computer";
        TypedQuery<Computer> query=entityManager.createQuery(jpaql,Computer.class);
        List<Computer> computerList = query.getResultList();
        return computerList;
    }

    @Override
    public Computer findById(int id) {
        Computer computer=entityManager.find(Computer.class,id);
        if(computer==null)
        {
            throw new ComputerNotFoundException("COMPUTER NOT FOUND");
        }
        return computer;
    }
}
