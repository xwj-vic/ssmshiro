package service.impl;

import dao.ShiroUserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ShiroUserService;

/**
 * Created by xuweijie on 2017/3/6.
 */
@Service
public class ShiroUserServiceImpl implements ShiroUserService {

    @Autowired
    private ShiroUserDao userDao;

    public User queryUser(String username){
        return userDao.queryByName(username);
    }
}
