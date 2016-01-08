package com.lin.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/1/6.
 */
@Controller
@RequestMapping("/mvc")
public class TestAction {
    @RequestMapping(value = "/test")
    @ResponseBody

    public String test(HttpServletRequest request,HttpServletResponse response){


        return "4444欢迎你，北京";
    }
}
