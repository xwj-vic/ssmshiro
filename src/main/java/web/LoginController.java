package web;

import entity.User;
import exception.CustomException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.ShiroUserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuweijie on 2017/3/3.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(HttpServletRequest request, Model model){
        CustomException customException=null;
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if((username!=null && password!=null)){
            UsernamePasswordToken token=new UsernamePasswordToken(username,password);
            Subject subject= SecurityUtils.getSubject();
            try{
                subject.login(token);
            }catch (AuthenticationException e){
                customException=new CustomException(e.getMessage());
            }
            if( subject.isAuthenticated()){
                subject.logout();
                System.out.println("认证成功");
                model.addAttribute("username",username);
                return "/loginsuccess";
            }else {
                model.addAttribute("exception",customException.getMessage());
                return "/refuse";
            }
        }
        return "login";
    }
}
