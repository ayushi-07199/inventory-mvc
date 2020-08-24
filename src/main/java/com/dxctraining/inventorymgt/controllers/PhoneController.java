package com.dxctraining.inventorymgt.controllers;

import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.services.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PhoneController {
    @Autowired
    IPhoneService phoneService;

    @GetMapping("/addphones")
    public ModelAndView addphone()
    {
        ModelAndView modelAndView=new ModelAndView("addphone");
        return modelAndView;
    }

    @GetMapping("/phonedetails")
    public ModelAndView addDetails(
            @RequestParam("pname") String name, @RequestParam("size") int size)
    {
        Phone phone=new Phone(name,size);
        phoneService.addPhone(phone);
        List<Phone>phonelist=phoneService.phonelist();
        ModelAndView modelAndView=new ModelAndView("phonelist","phones",phonelist);
        return modelAndView;
    }



}
