package com.tariq.serviceImpl;

import com.tariq.service.BlogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BlogsServiceImpl implements BlogsService {
    @Override
    public void getAllblogsFromDB() {
        System.out.println("Hello");
    }
}
