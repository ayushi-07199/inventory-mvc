package com.dxctraining.inventorymgt.item.dao;

import com.dxctraining.inventorymgt.item.entities.Item;

import java.util.List;

public interface IItemDao {
 public Item addItem(Item item);
 public void removeItem(int id);
 public Item findById(int id);
 public List<Item> itemList();
 //public List<Item> phoneList();
 //public List<Item> computerList();
}
