package com.tariq.controller;


import com.tariq.model.BlogDetails;
import com.tariq.service.BlogsService;
import com.tariq.util.JwtUtil;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
@RequiredArgsConstructor
@SecurityRequirement(name = "BearerAuth")
public class BlogsController {

    private final BlogsService blogsService;
    private final JwtUtil jwtUtil;
    @GetMapping(value = "/value")
    public String getAllBlogs() {
        String str = "hello";
        blogsService.getAllblogsFromDB();
        return "Tariq";
    }

    @GetMapping(value = "/getBlog")
    public ResponseEntity<Map<String, Object>> getBlog(@RequestParam int BlogId) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(value = "/getAllBlogs")
    public ResponseEntity<Map<String, Object>> getListOfBlog(
            @RequestParam() String start,
            @RequestParam(required = false) String end,
            @RequestParam String total,
            @RequestParam String sortBy
    ) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping(value = "/post")
    public ResponseEntity<String> getPostBlog(@RequestBody BlogDetails postBlogVO) {

        blogsService.postBlog(postBlogVO);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping(value = "/edit")
    public ResponseEntity<String> editBlogData(@RequestBody BlogDetails editBlogDetails) {
        return new ResponseEntity<>(null,HttpStatus.OK);
    }
}
