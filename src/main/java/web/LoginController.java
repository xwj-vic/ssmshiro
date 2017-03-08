package web;

import com.google.code.kaptcha.Constants;
import exception.CustomException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuweijie on 2017/3/3.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model){
        CustomException customException=null;
        String verifyCode=request.getParameter("verifyCode").toUpperCase();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(verifyCode.equals(request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY))){
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
                    model.addAttribute("username",username);
                    return "/loginsuccess";
                }else {
                    model.addAttribute("exception",customException.getMessage());
                    return "/refuse";
                }
            }
        }else {
            System.out.print("验证码输入不正确");
        }
        return "login";
    }
}
