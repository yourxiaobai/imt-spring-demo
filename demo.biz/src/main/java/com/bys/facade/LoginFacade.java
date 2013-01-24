package com.bys.facade;

/**
 * Project: demo.biz
 * 
 * File Created at 2012-11-21
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


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.imt.annotation.Interface;
import com.bys.service.LoginService;

/**
 * @author yansong.baiys
 *
 */
@Component
public class LoginFacade {

    @Autowired
    private LoginService loginService;
    @Interface(datas = { "data mi test","product","Data Migration","correct trade data","" })
    public String doLogin(String userName){
        return loginService.doLogin(userName);
        
    }
    
    @Interface(datas = { "很好和好","product","中文测试","import trade data","" })
    public String doLogin2(String userName){
        return loginService.doLogin(userName);
    }
}