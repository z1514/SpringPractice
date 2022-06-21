package com.spring.controller;

import com.spring.domain.Role;
import com.spring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/role")
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Role> roleList = roleService.list();
        modelAndView.addObject("roleList",roleList);
        //set view
        modelAndView.setViewName("role-list");
        System.out.println(roleList);
        return modelAndView;
    }
}
