package service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import dao.ShiroUserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ShiroUserService;

/**
 * Created by xuweijie on 2017/3/6.
 */
@Service
public class ShiroUserServiceImpl extends ServiceImpl<ShiroUserDao,User> implements ShiroUserService {

    @Autowired
    private ShiroUserDao userDao;

    public User queryUser(String username){
        return userDao.queryByName(username);
    }
}
