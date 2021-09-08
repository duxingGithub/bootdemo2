package com.controller;

import com.po.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
    @RequestMapping(value="check_user.do",method = RequestMethod.POST)
    public ModelAndView check(User user){
        ModelAndView mv=new ModelAndView();
        System.out.println(user.toString());
        if (user!=null){
            mv.addObject("us",user);
            mv.setViewName("ok.jsp");
        }
        return mv;
    }
}
