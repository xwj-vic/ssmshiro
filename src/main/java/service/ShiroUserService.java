package service;

import com.baomidou.mybatisplus.service.IService;
import entity.User;

import java.util.List;

/**
 * 认证授权服务接口
 * Created by xuweijie on 2017/3/3.
 */
public interface ShiroUserService extends IService<User> {
    User queryUser(String username);
}
