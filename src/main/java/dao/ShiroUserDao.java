package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xuweijie on 2017/3/7.
 */
public interface ShiroUserDao {
    public User queryByName(String username);
}
