package com.wfcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Liuqz on 2017-7-26.
 */
@Controller
public class SystemController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "forward:/pages/index/index.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "forward:/pages/login/login.html";
    }

    @ResponseBody
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public Object doLogin(){
        Map<String, String> map = new HashMap<String, String>();

        return map;
    }
}
