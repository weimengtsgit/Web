package cn.com.axiom.system.service;

import cn.com.axiom.service.EntityService;
import cn.com.axiom.system.entity.User;

public interface UserService extends EntityService<User, Long> {

  public static final String HASH_ALGORITHM = "MD5";

  /**
   * @param username
   * @return
   */
  public User findUserByUserName(String username);

}
