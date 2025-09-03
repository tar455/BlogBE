package com.tariq.service;

import com.tariq.exception.BusinessException;
import com.tariq.model.UserDetails;

public interface BlogsService {

    void getAllblogsFromDB();

    void register(UserDetails user) throws BusinessException;
}
