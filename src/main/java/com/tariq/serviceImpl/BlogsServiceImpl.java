package com.tariq.serviceImpl;

import com.tariq.exception.BusinessException;
import com.tariq.model.UserDetails;
import com.tariq.repository.UserDetailsRepository;
import com.tariq.service.BlogsService;
import com.tariq.util.JwtUtil;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class BlogsServiceImpl implements BlogsService {

    private final UserDetailsRepository userDetailsRepository;
    @Autowired
    private JwtUtil jwtUtil;
    BCryptPasswordEncoder pass = new BCryptPasswordEncoder();
    @Override
    public void getAllblogsFromDB() {
        System.out.println("Hello");
    }

    @Override
    public void register(UserDetails user) throws BusinessException {

        Optional<UserDetails> userFound = userDetailsRepository.findById(user.getEmail());
        if (!Objects.equals(user.getPassword(), user.getConfirmPassword())) {
            throw new BusinessException("112", "Password not matched");
        }
        if (userFound.isPresent()) {
            throw new BusinessException("111", "UserExsist");
        } else {
            UserDetails user1 = new UserDetails();
            user1.setUser(user.getUser());
            user1.setEmail(user.getEmail());
            user1.setPassword(pass.encode(user.getPassword()));
            user1.setConfirmPassword(pass.encode(user.getConfirmPassword()));
            user1.setPhoneNumber(user.getPhoneNumber());
            userDetailsRepository.save(user1);
        }
    }

    @Override
    public Map<String, Object> login(UserDetails user) throws BusinessException {
        Map<String, Object> result = new HashMap<>();
        Optional<UserDetails> userDB = userDetailsRepository.findById(user.getEmail());
        if (userDB.isPresent()) {
            if (pass.matches(user.getPassword(),userDB.get().getPassword())) {
                String token = jwtUtil.generateToken(user);
                result.put("token", token);
                log.info(token);
            }
            else {
                throw new BusinessException("123", "Invalid credentials");
            }

        } else
            throw new BusinessException("123", "Invalid credentials");

        return result;
    }
}
