/**
 * Project: imt-spring-demo
 * 
 * File Created at 2012-11-20
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.bys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bys.form.LoginForm;

@Controller
public class LoginController {
    @RequestMapping(value = "login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
                              LoginForm command) {
        String username = command.getUsername();
        ModelAndView mv = new ModelAndView("/index/index", "command", "LOGIN SUCCESS, " + username);
        return mv;
    }
}
