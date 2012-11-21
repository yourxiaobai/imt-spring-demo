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

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.imt.InterfaceManagementTool;
import com.bys.facade.LoginFacade;
import com.bys.form.LoginForm;

@Controller
public class LoginController {
    @Autowired
    private LoginFacade loginFacade;
    @Autowired
    private InterfaceManagementTool imt;
    
    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
                              LoginForm command) {
        String userName = command.getUsername();
        String result = loginFacade.doLogin(userName);
        Map<String, Object> model = new HashMap<String, Object>();
        
        model.put("loginUser", result);
        model.put("iil", imt.getInterfaceInfoList());
        ModelAndView mv = new ModelAndView("index/index", "model", model);
        return mv;
    }
}
