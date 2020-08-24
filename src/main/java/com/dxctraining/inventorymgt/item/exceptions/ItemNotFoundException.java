package com.dxctraining.inventorymgt.item.exceptions;

import com.dxctraining.inventorymgt.item.entities.Item;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(String msg)
    {
        super(msg);
    }
}
