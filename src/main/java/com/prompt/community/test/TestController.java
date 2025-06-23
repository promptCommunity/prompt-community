package com.prompt.community.test;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/test1")
    @ResponseBody
    public ResponseEntity<String> test1(){
        return ResponseEntity.ok("test1");
    }
}
