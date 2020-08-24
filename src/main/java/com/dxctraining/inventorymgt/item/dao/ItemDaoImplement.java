package com.dxctraining.inventorymgt.item.dao;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.exceptions.ItemNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class ItemDaoImplement implements IItemDao {


    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Item addItem(Item item) {
        entityManager.persist(item);
        return item;
    }


    @Override
    public void removeItem(int id) {
   entityManager.remove(id);
    }

    @Override
    public Item findById(int id) {
        Item item=entityManager.find(Item.class,id);
        if(item==null)
        {
            throw new ItemNotFoundException("not found");
        }
        return item;
    }
    @Override
    public List<Item> itemList() {
        String jpaql="from Item";
        TypedQuery<Item>query=entityManager.createQuery(jpaql,Item.class);
        List<Item> resultList = query.getResultList();
        return resultList;
    }

    /*@Override
    public List<Item> phoneList() {
        String jpaql="from Item";
        TypedQuery<Item>query=entityManager.createQuery(jpaql,Item.class);
        List<Item> resultList = query.getResultList();
        List<Item>phoneslist=null;
        for(Item item:resultList)
        {
            boolean isphone=item instanceof Phone;
            if(isphone)
            {
                phoneslist.add(item);
            }
        }
        return resultList;
    }

    @Override
    public List<Item> computerList() {
        String jpaql="from Item";
        TypedQuery<Item>query=entityManager.createQuery(jpaql,Item.class);
        List<Item> resultList = query.getResultList();
        List<Item>computerslist = null;
        for(Item item:resultList)
        {
            boolean iscom=item instanceof Computer;
            if(iscom)
            {
                computerslist.add(item);
            }
        }
        return resultList;
    }
    */
}
