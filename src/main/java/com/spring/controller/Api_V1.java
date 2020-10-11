package com.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class Api_V1 {
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody String main() {
        return "good";
    }

    // 리액트 테스트용 코드
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public HashMap hello(){
        HashMap result = new HashMap();
        result.put("message", "안녕하십니까~");
        return result;
    }
}
