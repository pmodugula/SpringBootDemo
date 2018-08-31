package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.SumService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
@RestController

public class SumController {

    @RequestMapping(value="/math/add" ,method = RequestMethod.GET)
    public SumService sumGetController(@RequestParam int param1 ,@RequestParam int param2) {
        return new SumService(10,20);
    }
 
    /**
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public SumService sumPOSTController(@RequestBody SumService sumService) {
        return new sumService= new SumService();
    }
    **/
        
}

