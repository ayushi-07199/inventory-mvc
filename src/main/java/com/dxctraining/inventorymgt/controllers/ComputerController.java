package com.dxctraining.inventorymgt.controllers;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.services.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ComputerController {

    @Autowired
    IComputerService computerService;

    @GetMapping("/addcomputer")
    public ModelAndView addcomputer()
    {
        ModelAndView modelAndView=new ModelAndView("addcomputer");
        return modelAndView;
    }

    @GetMapping("/computerdetails")
    public ModelAndView addDetails(
            @RequestParam("cname") String name,@RequestParam("size") int size)
    {
        Computer computer=new Computer(name,size);
        computerService.addComputer(computer);
        List<Computer> computerlist=computerService.computerList();
        System.out.println("Inside computer list");
        ModelAndView modelAndView=new ModelAndView("computerlist","computers",computerlist);
        return modelAndView;
    }




}
