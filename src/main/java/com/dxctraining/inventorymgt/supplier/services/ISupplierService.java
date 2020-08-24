package com.dxctraining.inventorymgt.supplier.services;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

import java.util.List;

public interface ISupplierService {
    public Supplier addSupplier(Supplier supplier);
    public void removeSupplier(int id);
    public List<Supplier> supplierList();
    public Supplier findById(int id);
     boolean authenticate(int id,String password);
}
