package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.User;
import uk.ac.sheffield.coursemgr.mapper.UserMapper;
import uk.ac.sheffield.coursemgr.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Long userId) {
        // 临时数据
        User user = new User();
        user.setUserId(userId);
        user.setUsername("lizheng");
        user.setPassword("123456");
        user.setRealName("李政");
        user.setAge(23);
        return user;
    }

    @Override
    public int insertUser(User user) {
        Preconditions.checkNotNull(user, "新增时user不能为空");
        return userMapper.insert(user);
    }

    @Override
    public int updateUserByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKey(user);
    }



}
