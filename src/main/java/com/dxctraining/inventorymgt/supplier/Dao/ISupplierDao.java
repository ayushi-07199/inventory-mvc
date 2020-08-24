package com.dxctraining.inventorymgt.supplier.Dao;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

import java.util.List;

public interface ISupplierDao {
public Supplier addSupplier(Supplier supplier);
public void removeSupplier(int id);
public List<Supplier> supplierList();
public Supplier findById(int id);

}
