package com.spring.service;

import com.spring.model.ExampleUser;
import com.spring.model.ExampleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
public class ExampleUsersService {
    @Autowired
    private ExampleUserRepository exampleUserRepository;

    @Transactional
    public Long save(ExampleUser dto){
        return exampleUserRepository.save(dto).getExampleUserId();
    }
}
