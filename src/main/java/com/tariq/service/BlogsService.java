package com.tariq.service;

import com.tariq.exception.BusinessException;
import com.tariq.model.UserDetails;

import java.util.Map;

public interface BlogsService {

    void getAllblogsFromDB();

    void register(UserDetails user) throws BusinessException;

    Map<String,Object> login(UserDetails user) throws BusinessException;
}
