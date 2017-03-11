package filter;

import com.google.code.kaptcha.Constants;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xuweijie on 2017/3/10.
 * shiro的表单过滤器:FormAuthenticationFilter,重写表单过滤器，实现先通过验证码验证再验证账户密码
 */
public class CustomFromAuthenticationFilter extends FormAuthenticationFilter{


    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest= (HttpServletRequest) request;
        HttpSession session=httpServletRequest.getSession();
        String verifyCode;
        try{
            verifyCode=httpServletRequest.getParameter("verifyCode").toUpperCase();
        }catch (NullPointerException e){
            verifyCode=null;
        }
        //判断验证码输入是否正确
        if(verifyCode!=null && !verifyCode.equals(session.getAttribute(Constants.KAPTCHA_SESSION_KEY))){
            //如果校验失败，将验证码错误的失败信息，通过shiroLoginFailure设置到request中
            httpServletRequest.setAttribute("shiroLoginFailure","randomCodeError");
            //拒绝访问，不再校验账号和密码
            return true;
        }
        return super.onAccessDenied(request, response);
    }

    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        WebUtils.issueRedirect(request,response,getSuccessUrl());
        return false;
    }
}
