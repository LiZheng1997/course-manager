package uk.ac.sheffield.coursemgr.mapper;

import org.springframework.stereotype.Repository;
import uk.ac.sheffield.coursemgr.domain.pojo.User;

/**
 * User模块的Dao层.
 */
@Repository
public interface UserMapper {

    int insert(User user);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKey(User user);
}
