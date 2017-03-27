package dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import entity.User;

/**
 * Created by xuweijie on 2017/3/7.
 */
public interface ShiroUserDao extends BaseMapper<User> {
   User queryByName(String username);
}
