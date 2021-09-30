package com.ryan.hellospringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping(path = "/")
    public ResponseEntity<Map> get() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "hello world");
        String time = String.valueOf(System.currentTimeMillis());
        response.put("time", time);
        return ResponseEntity.ok(response);
    }

}
