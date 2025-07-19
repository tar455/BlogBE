package com.tariq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/")
public record AdminController() {
    @PostMapping(value = "/register")
    public ResponseEntity<Map<String,Object>> getRegisterWithUs()
    {
        ResponseEntity<Map<String, Object>> o = null;
        return o;
    }
    
    @PostMapping(value = "/login")
    public ResponseEntity<Map<String,Object>> loginWithUs()
    {
        ResponseEntity<Map<String, Object>> o = null;
        return o;
    }
}
