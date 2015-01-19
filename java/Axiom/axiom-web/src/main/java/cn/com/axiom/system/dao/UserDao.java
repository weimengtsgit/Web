package cn.com.axiom.system.dao;

import org.springframework.stereotype.Repository;
import cn.com.axiom.dao.BaseDao;
import cn.com.axiom.system.entity.User;

/**
 * @Description 用户持久化层
 */
@Repository
public interface UserDao extends BaseDao<User,Long> {

	/**
	 * @param username
	 * @return
	 */
	User findUserByUserName(String userName);

}
