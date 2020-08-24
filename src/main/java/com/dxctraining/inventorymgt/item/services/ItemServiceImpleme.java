package com.dxctraining.inventorymgt.item.services;

import com.dxctraining.inventorymgt.item.dao.IItemDao;
import com.dxctraining.inventorymgt.item.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class ItemServiceImpleme implements IItemService{

    @Autowired
    private IItemDao itemDao;

    @Override
    public Item addItem(Item item) {
        itemDao.addItem(item);
        return item;
    }

    @Override
    public void removeItem(int id) {
        itemDao.removeItem(id);
    }
    @Override
    public Item findById(int id) {
        Item item=itemDao.findById(id);
        return item;
    }
    @Override
    public List<Item> itemList() {
        List<Item>result=itemDao.itemList();
        return result;
    }

    /*@Override
    public List<Phone> phoneList() {
        List<Item>phones=itemDao.itemList();
        List<Phone>phoneslist=null;
        for(Item item:phones)
        {
            Boolean isPhone=item instanceof Phone;
            if(isPhone)
            {
                   phoneslist.add((Phone) item);
            }
        }
        return phoneslist;
    }*/


    /*@Override
    public List<Computer> computerList() {
        List<Item>itemList=itemDao.itemList();
        List<Computer>computerlist=null;
        for(Item item:itemList)
        {
            Boolean isCom=item instanceof Computer;
            if(isCom)
            {
                computerlist.add((Computer)item);
            }
        }
        return computerlist;
    }*/
}
