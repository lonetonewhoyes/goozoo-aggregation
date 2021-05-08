package com.goozoo.controller;
import com.goozoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id)
    {
        if(userService.Select(id)==null) {
            return "null";
        }else{
                return(userService.Select(id).toString());
            }
    }

}
