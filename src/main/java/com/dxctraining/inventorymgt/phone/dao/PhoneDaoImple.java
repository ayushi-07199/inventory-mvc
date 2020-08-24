package com.dxctraining.inventorymgt.phone.dao;

import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.exceptions.PhoneNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class PhoneDaoImple implements IPhoneDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Phone addPhone(Phone phone) {
       entityManager.persist(phone);
       return phone;
    }

    @Override
    public void removePhone(int id) {
     entityManager.remove(id);
    }

    @Override
    public List<Phone> phonelist() {
        String jpaql="from Phone";
        TypedQuery<Phone> query=entityManager.createQuery(jpaql,Phone.class);
        List<Phone> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public Phone findById(int id) {
      Phone phone=entityManager.find(Phone.class,id);
      if (phone==null)
      {
          throw new PhoneNotFoundException("PHONE NOT FOUND");
      }
      return phone;
    }
}
