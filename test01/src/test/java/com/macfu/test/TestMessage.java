package com.macfu.test;

import com.macfu.remoteapi.IMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/13 15:26
 * @Description: 远程接口调用测试
 */
@ContextConfiguration(locations = {"classpath:spring-dubbo-consumer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessage {
    @Resource
    private IMessage msg;

    @Test
    public void testEcho(){
        System.out.println(this.msg.echo("www.google.com" + "********"));
    }
}
