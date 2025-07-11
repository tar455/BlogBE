package com.tariq.controller;


import com.tariq.service.BlogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BlogsController {

    private final BlogsService blogsService;

    @GetMapping(value = "/value")
    public String getAllBlogs() {
        String str="hello";
        blogsService.getAllblogsFromDB();
        return "Tariq";
    }
}
