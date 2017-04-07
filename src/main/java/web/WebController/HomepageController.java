package web.WebController;

import entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xuweijie on 2017/3/11.
 */
@Controller
@RequestMapping("/home")
public class HomepageController{

    @RequestMapping(value = "homepage")
    public String loginsuccess( Model model) throws Exception{
        Subject subject= SecurityUtils.getSubject();
        String username= (String) subject.getPrincipal();
        model.addAttribute("username",username);
        return "Homepage";
    }
}
