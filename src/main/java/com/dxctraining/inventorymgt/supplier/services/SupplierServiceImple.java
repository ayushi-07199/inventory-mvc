package com.dxctraining.inventorymgt.supplier.services;

import com.dxctraining.inventorymgt.supplier.Dao.ISupplierDao;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class SupplierServiceImple implements ISupplierService {
    @Autowired
    private ISupplierDao supplierDao;
    @Override
    public Supplier addSupplier(Supplier supplier) {
        supplierDao.addSupplier(supplier);
        return supplier;
    }
    @Override
    public void removeSupplier(int id) {
      supplierDao.removeSupplier(id);
    }
    @Override
    public List<Supplier> supplierList() {
        List<Supplier>result=supplierDao.supplierList();
        return result;
    }
    @Override
    public boolean authenticate(int id, String password) {
        Supplier supplier=supplierDao.findById(id);
        String supplierpwd=supplier.getPassword();
        return password.equals(supplierpwd);
    }
    @Override
    public Supplier findById(int id) {
       Supplier supplier=supplierDao.findById(id);
       return supplier;
    }


}
