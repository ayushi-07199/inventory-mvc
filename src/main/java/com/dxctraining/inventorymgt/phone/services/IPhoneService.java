package com.dxctraining.inventorymgt.phone.services;

import com.dxctraining.inventorymgt.phone.entities.Phone;

import java.util.List;

public interface IPhoneService {
    Phone addPhone(Phone phone);
    void removePhone(int id);
    List<Phone> phonelist();
    Phone findById(int id);
}
