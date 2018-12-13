package com.macfu.service;

import com.macfu.remoteapi.IMessage;
import org.springframework.stereotype.Component;

/**
 * @Author: liming
 * @Date: 2018/12/13 10:19
 * @Description: IMessage接口实现类
 */
@Component
public class MessageImpl implements IMessage {

    @Override
    public String echo(String msg) {
        return "EHCO" + msg;
    }
}
