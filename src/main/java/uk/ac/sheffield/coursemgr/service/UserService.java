package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.User;

public interface UserService {

    int insertUser(User user);

    int updateUserByPrimaryKey(User user);

    User selectByPrimaryKey(Long userId);

}
