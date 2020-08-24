package com.dxctraining.inventorymgt.supplier.Dao;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class SupplierDaoImplem implements ISupplierDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Supplier addSupplier(Supplier supplier) {
        entityManager.persist(supplier);
        return supplier;
    }

    @Override
    public void removeSupplier(int id) {
  entityManager.remove(id);
    }

    @Override
    public List<Supplier> supplierList() {
        String jpaQuery = "from Supplier";
       TypedQuery<Supplier>query= entityManager.createQuery(jpaQuery, Supplier.class);
        List<Supplier> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public Supplier findById(int id) {
        Supplier supplier=entityManager.find(Supplier.class,id);
        return  supplier;
    }


}
