package com.aathavan.ecom.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operator {

    @GetMapping("/get")
    private String getUser(){
        return "Aathavan";
    }
}
