package com.lxy.hello.service;

import com.lxy.hello.pojo.UserDO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<UserDO> findUser();

    List<UserDO> findById(Integer id);

}
