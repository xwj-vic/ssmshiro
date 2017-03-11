package exception;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xuweijie on 2017/3/10.
 * 统一异常处理类
 * 可以在controller方法、service方法、dao实现类中抛出异常
 * 要求dao、service、controller遇到异常全部向上抛出异常，方法向 上抛出异常throws Exception
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {

    //前端控制器DispatcherServlet在进行HandlerMapping、
    // 调用HandlerAdapter执行Handler过程中，如果遇到异常就会执行此方法
    //参数中的handler是最终要执行的Handler，它的真实身份是HandlerMethod
    //ex就是接受到的异常信息

    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object handler, Exception ex) {

        ex.printStackTrace();
        /*统一异常处理代码
        *针对系统自定义的CustomException异常，就可以直接从异常中获取异常信息，将异常处理在错误页面展示
        *异常信息
        * */
        String message=null;
        CustomException customException=null;

        //如果ex是系统自定义的异常，我们就直接取出异常信息
        if(ex instanceof CustomException){
            customException= (CustomException) ex;
        }else {
            customException=new CustomException("未知错误");
        }

        //错误信息
        message=customException.getMessage();
        httpServletRequest.setAttribute("message",message);

        try{
            //转向到错误页面
            httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(httpServletRequest,httpServletResponse);
        }catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ModelAndView();
    }
}
