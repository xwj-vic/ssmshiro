package web.AppAPI;

import entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ShiroUserService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuweijie on 2017/3/14.
 * 接口
 */
@RequestMapping("/api")
@Controller
public class apitest {

    @Autowired
    private ShiroUserService shiroUserService;

    @RequestMapping("/jsontest")
    @ResponseBody
    public Map<String, User> getjsopn() {
        User user=shiroUserService.queryUser("许伟杰");
        Map<String,User>map=new HashMap<String, User>();
        map.put("user",user);
        return map;
    }
}
