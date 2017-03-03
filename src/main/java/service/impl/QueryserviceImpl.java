package service.impl;

import dao.QueryTestDao;
import entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.Queryservice;

/**
 * Created by xuweijie on 2017/3/3.
 */
@Service
public class QueryserviceImpl implements Queryservice {

    @Autowired
    private QueryTestDao queryTestDao;


    public Seckill getByid(long seckillId) {
        return queryTestDao.queryById(seckillId);
    }
}
