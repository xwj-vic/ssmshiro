package web;

import entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.Queryservice;

/**
 * Created by xuweijie on 2017/3/3.
 */
@Controller
public class testcontroller {

    @Autowired
    private Queryservice queryservice;

    @RequestMapping("/content")
    public String showcontent(Model model){
        long id=1000;
        Seckill seckill=queryservice.getByid(id);
        model.addAttribute("seckill",seckill.getName());
        return "content";
    }
}
