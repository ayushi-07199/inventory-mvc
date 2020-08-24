package com.dxctraining.inventorymgt.item.services;

import com.dxctraining.inventorymgt.item.entities.Item;

import java.util.List;

public interface IItemService {
    public Item addItem(Item item);
    public void removeItem(int id);
    public Item findById(int id);
    public List<Item> itemList();
    //public List<Item> phoneList();
    //public List<Item> computerList();
}
