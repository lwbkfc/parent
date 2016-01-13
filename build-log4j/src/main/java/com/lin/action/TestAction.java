package com.lin.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/pattern1/6.
 */
@Controller
@RequestMapping("/log4j")
public class TestAction {
    final Logger logger = LoggerFactory.getLogger(TestAction.class);
    @RequestMapping(value = "/test")
    @ResponseBody

    public String test(HttpServletRequest request,HttpServletResponse response){
        logger.error("hello world dddddd............................");
        return "4444欢迎你，北京";
    }
}
