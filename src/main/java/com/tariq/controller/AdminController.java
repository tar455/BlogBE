package com.tariq.controller;

import com.tariq.exception.BusinessException;
import com.tariq.model.UserDetails;
import com.tariq.service.BlogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/")
@RequiredArgsConstructor
public class AdminController {

    private final BlogsService blogsService;


    @PostMapping(value = "/register")
    public ResponseEntity<String> getRegisterWithUs(@RequestBody UserDetails user) throws BusinessException {
        blogsService.register(user);
        return ResponseEntity.ok("Registered successfully");
    }
    
    @PostMapping(value = "/login")
    public ResponseEntity<Map<String,Object>> loginWithUs()
    {
        ResponseEntity<Map<String, Object>> o = null;
        return o;
    }
}
