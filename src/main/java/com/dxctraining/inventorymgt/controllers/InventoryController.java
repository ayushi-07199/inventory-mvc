package com.dxctraining.inventorymgt.controllers;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.services.IComputerService;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.item.services.IItemService;
import com.dxctraining.inventorymgt.phone.services.IPhoneService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class InventoryController {

    @Autowired
    private ISupplierService supplierservice;
    @Autowired
    private IItemService itemService;
    @Autowired
    private IPhoneService phoneService;
    @Autowired
    private IComputerService computerService;

    @PostConstruct
    public void run()
    {
        //Suppliers
        Supplier supplier1 = new Supplier("Ayushi","1234");
        Supplier supplier2 = new Supplier("Anmol","1234");

        supplierservice.addSupplier(supplier1);
        supplierservice.addSupplier(supplier2);
        //computers
        Computer computer1=new Computer("HP",supplier1,1000);
        Computer computer2=new Computer("DELL",supplier2,2000);
        computerService.addComputer(computer1);
        computerService.addComputer(computer2);

        int cid=computer1.getId();
        Computer computer=computerService.findById(cid);
        System.out.println(computer.getDiskSize()+"  "+computer.getId()+"  "+computer.getName());

        //phones
        Phone phone1=new Phone("nokia",supplier1,10);
        Phone phone2=new Phone("samsung",supplier2,90);
        phoneService.addPhone(phone1);
        phoneService.addPhone(phone2);

        int phoneid=phone1.getId();
        Phone phone=phoneService.findById(phoneid);
        System.out.println(phone.getStorageSize()+" "+phone.getId()+" "+phone.getName());


    }
    @GetMapping("/suppliers")
    public ModelAndView all()
    {
        List<Supplier>supplierList=supplierservice.supplierList();
        System.out.println("inside suppliers list");
        ModelAndView modelAndView=new ModelAndView("list","suppliers",supplierList);
        return  modelAndView;
    }

    @GetMapping("/computers")
    public ModelAndView computers()
    {
        List<Computer>computerlist=computerService.computerList();
        System.out.println("Inside computer list");
        System.out.println(computerlist);
        ModelAndView modelAndView=new ModelAndView("computerlist","computers",computerlist);
        return modelAndView;
    }


    @GetMapping("/phones")
    public ModelAndView phones()
    {
        List<Phone>phonelist=phoneService.phonelist();
        System.out.println("Inside phones list");
        System.out.println(phonelist);
        ModelAndView modelAndView=new ModelAndView("phonelist","phones",phonelist);
        return modelAndView;
    }




}
