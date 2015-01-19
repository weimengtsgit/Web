package cn.com.axiom.system.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SystemController {

  @RequestMapping(value = "/login.html", method = RequestMethod.GET)
  public String login() {
    Subject subject = SecurityUtils.getSubject();
    if (subject.isAuthenticated()) {
      return "redirect:/index.html";
    }
    return "system/login";
  }

  @RequestMapping(value = "/login.html", method = RequestMethod.POST)
  public ModelAndView fail(
      @RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM) String userName, Model model) {
    
    
    model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, userName);
    return new ModelAndView("system/login");
  }

  @RequestMapping("/index.html")
  public ModelAndView home() {
    return new ModelAndView("index");
  }

  @RequestMapping(value = "/system/index.html", method = RequestMethod.GET)
  public ModelAndView system() {
    return new ModelAndView("system/index");
  }

  @RequestMapping(value = "/404.html", method = RequestMethod.GET)
  public ModelAndView notFoundPage() {
    return new ModelAndView("common/404");
  }
}
