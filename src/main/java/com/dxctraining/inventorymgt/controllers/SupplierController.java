package com.dxctraining.inventorymgt.controllers;

import com.dxctraining.inventorymgt.dto.CreateSupplier;
import com.dxctraining.inventorymgt.dto.SessionMaintain;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.services.IItemService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class SupplierController {
    @Autowired
    private ISupplierService supplierService;
    @Autowired
    private SessionMaintain sessionData;
    @Autowired
    private IItemService iItemService;
    @PostConstruct
    public void run() {
        //Suppliers
        Supplier supplier1 = new Supplier("Ayushi", "123");
        Supplier supplier2 = new Supplier("Anmol", "1234");
        supplierService.addSupplier(supplier1);
        supplierService.addSupplier(supplier2);

    }
    
    
    @GetMapping("/supplierlist")
	public ModelAndView allSuppliers() {
		if(!sessionData.isLoggedIn()) {
			return new ModelAndView("login");
		}
		List<Supplier>supplierList = supplierService.supplierList();
		ModelAndView modelAndView = new ModelAndView("list","suppliers",supplierList);
		return modelAndView;
	}

  @GetMapping("/addsupplier")
  public ModelAndView addSupplier()
  {
      ModelAndView modelAndView=new ModelAndView("addsupplier");
      return modelAndView;
  }
  
  
  @GetMapping("/processaddsupplier")
	public ModelAndView processRegister(@RequestParam("supname")String name, @RequestParam("password")String password) {
		Supplier supplier = new Supplier(name,password);
		supplier = supplierService.addSupplier(supplier);
		ModelAndView modelAndView = new ModelAndView("details","supplier",supplier);
		return modelAndView;
	}
  
  @GetMapping("/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
  
  @GetMapping("/supplier")
	public ModelAndView supplierDetails(@RequestParam("id")int id) {
		if(!sessionData.isLoggedIn()) {
			return new ModelAndView("login");
		}
		Supplier supplier = supplierService.findById(id);
		ModelAndView modelAndView = new ModelAndView("supplierdetails", "supplier", supplier);
		return modelAndView;	
	}
  
  
  @GetMapping("/processlogin")
	public ModelAndView processLogin(@RequestParam("id")int id,@RequestParam("password")String password) {
		boolean correct = supplierService.authenticate(id,password);
		if(correct) {
			sessionData.saveLogin(id);
			Supplier supplier = supplierService.findById(id);
			ModelAndView modelAndView = new ModelAndView("details","supplier",supplier);
			return modelAndView;
		}
			ModelAndView modelAndView = new ModelAndView("login");
			return modelAndView;
	}
 

   
    @GetMapping("/logout")
    public ModelAndView logout(){
        sessionData.clear();
        ModelAndView modelAndView=new ModelAndView("login");
        return modelAndView;
    }



 /*   @GetMapping("/allitems")
    public ModelAndView items()
    {
        if(!sessionData.isLoggedIn()){
            return new ModelAndView("login");
        }
        List<Item> itemslist=iItemService.itemList();
        System.out.println("Inside items list");
        ModelAndView modelAndView=new ModelAndView("itemslist","items",itemslist);
        return modelAndView;
    }
*/

    @PostMapping("/postsupplierregister")
    public ModelAndView postSupplierRegister(@RequestParam("name") String name,@RequestParam("password")
                                             String password)
    {
        Supplier supplier=new Supplier(name,password);
        supplierService.addSupplier(supplier);
        List<Supplier>supplierList=supplierService.supplierList();
        ModelAndView modelAndView=new ModelAndView("list","items",supplier);
        return modelAndView;
    }

    @GetMapping("/register")
    public ModelAndView registerPage(){
        System.out.println("inside register post method");
        ModelAndView mv=new ModelAndView("supplierregister");
        return mv;
    }







}
