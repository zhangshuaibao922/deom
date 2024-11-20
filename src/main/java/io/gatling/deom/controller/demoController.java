package io.gatling.deom.controller;

import io.gatling.deom.service.demoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class demoController {

    @Resource
    demoService service;

    @GetMapping("/get")
    public String get() {
        return service.get();
    }
}
