package com.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("service/v1")
public class ServiceController {
    @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    String main()  {
        return "good page";
    }

}
