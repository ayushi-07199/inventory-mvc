package com.dxctraining.inventorymgt.item.entities;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    private Supplier supplier;

    public Item(String name, Supplier supplier) {
        this.name = name;
        this.supplier = supplier;
    }

    public Item() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
    }

    @Override
    public int hashCode() {
        return id;
    }


}

