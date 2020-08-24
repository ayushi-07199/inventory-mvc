package com.dxctraining.inventorymgt.computer.entities;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

import javax.persistence.Entity;

@Entity
public class Computer extends Item {
    private int diskSize;
    public Computer(String name, Supplier supplier, int diskSize) {
        super(name, supplier);
        this.diskSize=diskSize;
    }
    public Computer()
    {

    }
   public Computer(String name,int diskSize)
   {
       this(name,null,diskSize);
   }

    public int getDiskSize() {
        return diskSize;
    }
    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }
}
