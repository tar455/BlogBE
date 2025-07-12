package com.tariq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public record AdminController() {
    @PostMapping(name = "/register")
    public ResponseEntity<Map<String,Object>> getRegister()
    {
        ResponseEntity<Map<String, Object>> o = null;
        return o;
    }
    
    @PostMapping(name = "/login")
    public ResponseEntity<Map<String,Object>> loginWithUs()
    {
        ResponseEntity<Map<String, Object>> o = null;
        return o;
    }
}
