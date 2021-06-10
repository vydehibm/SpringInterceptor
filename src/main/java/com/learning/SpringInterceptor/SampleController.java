package com.learning.SpringInterceptor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value = "/sample/{user}")
    public String get(@PathVariable String user){
        return user;
    }
}
