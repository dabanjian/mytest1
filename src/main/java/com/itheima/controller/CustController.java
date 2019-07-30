package com.itheima.controller;

import com.itheima.model.Cust;
import com.itheima.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/cust")
public class CustController {

    @Autowired
    private CustService custService;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String query(Model model){
        List<Cust> custList = custService.query();
        model.addAttribute("custList",custList);
        return "center";
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public String list(@RequestParam(value = "cust_name",required = false)String cust_name, @RequestParam(value = "cust_type",required = false) String cust_type, Model model){
        List<Cust> custList = custService.list(cust_name, cust_type);
        model.addAttribute("custList",custList);
        return "center";
    }
}
