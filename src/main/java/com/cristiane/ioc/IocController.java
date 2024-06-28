package com.cristiane.ioc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/ioc")
public class IocController {

    @Autowired
    Ioc ioc;

    @GetMapping("/")    
    public String callIoc() {
        var resultado = ioc.callIoc();

        return resultado;
    }    
}
