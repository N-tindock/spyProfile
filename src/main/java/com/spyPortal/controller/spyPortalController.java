package com.spyPortal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spyPortalController {


    @GetMapping("/Testing")
    public String testing(){
        return "testing reday";
    }



}
