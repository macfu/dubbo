package com.macfu.controller;

import com.macfu.remoteapi.IMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/13 16:30
 * @Description:
 */
@Controller
@RequestMapping("/pages/message")
public class MessageController {
    @Resource
    private IMessage message;

    @RequestMapping("/echo")
    public ModelAndView echo(String msg) {
        ModelAndView mav = new ModelAndView("message/show");
        mav.addObject("info", this.message.echo(msg));
        return mav;
    }
}
