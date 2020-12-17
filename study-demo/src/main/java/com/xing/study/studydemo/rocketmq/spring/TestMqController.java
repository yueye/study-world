///**
// * Copyright (C), 2015-2020, 联想（北京）有限公司
// * FileName: sdf
// * Author:   liujx
// * Date:     2020/12/2 13:59
// * Description:
// * History:
// * 描述
// */
//package com.xing.study.studydemo.rocketmq.spring;
//
//import cn.hutool.core.lang.Console;
//import com.alibaba.fastjson.JSON;
//import lombok.extern.log4j.Log4j2;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * 〈〉
// *
// * @author liujx16
// * @create 2020/12/2
// */
//@RestController
//@RequestMapping("/mq")
//@Log4j2
//@Slf4j
//public class TestMqController {
//
//    @Autowired
//    private RocketMQProducer rocketMQProducer;
//
//    @GetMapping("/testmq")
//    public void testmq(String info) {
//        log.info(info);
//        SendResult sendResult = rocketMQProducer.sendMsg(info);
//        Console.log("发送确认回复   "+JSON.toJSONString(sendResult));
//    }
//    @GetMapping("/testmq1")
//    public void testmq1(String info) {
//        log.info(info);
//        SendResult sendResult = rocketMQProducer.sendMsg("queue_test_topic1","tag1",info);
//        Console.log(JSON.toJSONString(sendResult));
//    }
//}