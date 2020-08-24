package com.dxctraining.inventorymgt.phone.dao;

import com.dxctraining.inventorymgt.phone.entities.Phone;

import java.util.List;

public interface IPhoneDao {
    Phone addPhone(Phone phone);
    void removePhone(int id);
    List<Phone> phonelist();
    Phone findById(int id);
}
