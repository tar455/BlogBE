package com.tariq.serviceImpl;

import com.tariq.exception.BusinessException;
import com.tariq.model.UserDetails;
import com.tariq.repository.UserDetailsRepository;
import com.tariq.service.BlogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class BlogsServiceImpl implements BlogsService {

    private final UserDetailsRepository userDetailsRepository;
    @Override
    public void getAllblogsFromDB() {
        System.out.println("Hello");
    }

    @Override
    public void register(UserDetails user) throws BusinessException {
        PasswordEncoder pass=new BCryptPasswordEncoder();
        Optional<UserDetails> userFound =userDetailsRepository.findById(user.getEmail());
        if(!Objects.equals(user.getPassword(), user.getConfirmPassword())){
            throw new BusinessException("112","Password not matched");
        }
        if(userFound.isPresent()){
            throw new BusinessException("111","UserExsist");
        }
        else {
            UserDetails user1=new UserDetails();
            user1.setUser(user.getUser());
            user1.setEmail(user.getEmail());
            user1.setPassword(pass.encode(user.getPassword()));
            user1.setConfirmPassword(pass.encode(user.getConfirmPassword()));
            user1.setPhoneNumber(user.getPhoneNumber());
            userDetailsRepository.save(user1);
        }
    }
}
