package com.dxctraining.inventorymgt.phone.entities;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

import javax.persistence.Entity;

@Entity
public class Phone extends Item {
private int StorageSize;
    public Phone(String name, Supplier supplier, int storageSize) {
        super(name, supplier);
        this.StorageSize = storageSize;
    }
    public Phone()
{
}
public Phone(String name,int storageSize)
{
    this(name,null,storageSize);
}
    public int getStorageSize() {
        return StorageSize;
    }

    public void setStorageSize(int storageSize) {
        StorageSize = storageSize;
    }
}
