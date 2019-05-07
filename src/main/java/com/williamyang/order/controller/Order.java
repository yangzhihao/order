package com.williamyang.order.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Order {
    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String getOrder() {
        return "This is New Order Service";
    }
}
