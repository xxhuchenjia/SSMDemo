package com.newer.controller;

import com.newer.bean.User;
import com.newer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/reg")
    public String reg(User user, HttpSession session){
        if(userService.addUser(user) > 0){
            return "redirect:/user/users";
        }else{
            session.setAttribute("msg","注册失败，请重新注册！");
            return "index";
        }
    }

    @RequestMapping("/users")
    public String findAll(ModelMap map){
        List<User> list = userService.findAll();
        map.put("users",list);
        return "list";
    }

    @RequestMapping(value = "/findById/{userId}",method = RequestMethod.GET)
    public String findById(@PathVariable("userId") Integer userId, Model model){
        User user = userService.findById(userId);
        model.addAttribute("item",user);
        return "details";
    }
}
