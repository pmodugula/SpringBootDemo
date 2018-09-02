package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.SumService;
import com.example.demo.model.SumModel;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@RestController

public class SumController {

    @RequestMapping(value="/math/add" ,method = RequestMethod.GET , produces=MediaType.APPLICATION_JSON_VALUE)
    public SumService sumGetController(@RequestParam int param1 ,@RequestParam int param2) {
        return new SumService(param1,param2);
    }
 
    
    @RequestMapping(value = "/math/add", method = RequestMethod.POST , produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SumService sumPOSTController(@RequestBody SumModel sumModel) {
        return new SumService(sumModel.getParam1(),sumModel.getParam2());
    }
    
       
    
}

