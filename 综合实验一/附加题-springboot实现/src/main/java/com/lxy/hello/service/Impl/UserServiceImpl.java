package com.lxy.hello.service.Impl;

import com.lxy.hello.mapper.UserMapper;
import com.lxy.hello.pojo.UserDO;
import com.lxy.hello.pojo.UserDOExample;
import com.lxy.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    
    
    @Override
    public List<UserDO> findUser() {
        UserDOExample userDOExample = new UserDOExample();

        //查询语句
        userDOExample.or().andAgeIsNotNull()
                .andNameIsNotNull();

        //将查询内容以list集合返回
        List<UserDO> userDOS = userMapper.selectByExample(userDOExample);

        return userDOS;
    }

    @Override
    public List<UserDO> findById(Integer id) {
        UserDOExample userDOExample = new UserDOExample();

        //查询语句
        userDOExample.or().andIdEqualTo(id);

        //将查询内容以list集合返回
        List<UserDO> userDOS = userMapper.selectByExample(userDOExample);

        return userDOS;
    }
}
