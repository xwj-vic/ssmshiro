package web.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuweijie on 2017/3/14.
 */
@Controller
public class ftlcontroller {
    @RequestMapping(value="/welcome",method={RequestMethod.GET})
    public ModelAndView getFirstPage(HttpServletRequest request) {
        //welcom就是视图的名称（welcom.ftl）
        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("name", "My First Spring Mvc and Freemarker !");
        return mv;
    }
}
