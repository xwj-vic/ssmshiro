package dao;

import entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuweijie on 2017/3/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})
public class QueryTestDaoTest {
    //注入Dao实现依赖
    @Resource
    private QueryTestDao queryTestDao;

    @Test
    public void queryById() throws Exception {
        long id=1000;
        Seckill seckill=queryTestDao.queryById(id);
        System.out.println(seckill);
    }

}