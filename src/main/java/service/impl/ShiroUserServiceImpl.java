package service.impl;

import dao.ShiroUserDao;
import entity.User;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.ShiroUserService;
import util.MD5Util;

import java.util.List;

/**
 * Created by xuweijie on 2017/3/6.
 */
@Service
public class ShiroUserServiceImpl implements ShiroUserService {

    @Autowired
    private ShiroUserDao userDao;

    public User queryUser(String username) {
        return userDao.queryByName(username);
    }
}
