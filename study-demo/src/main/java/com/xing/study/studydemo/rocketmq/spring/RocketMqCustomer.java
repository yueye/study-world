//package com.xing.study.studydemo.rocketmq.spring;
//
//import com.alibaba.fastjson.JSON;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//@RocketMQMessageListener(topic = "queue_test_topic", selectorExpression="*",consumerGroup = "queue_group_test")
//public class RocketMqCustomer implements RocketMQListener<MessageExt> {
//
//    @Override
//    public void onMessage(MessageExt message) {
//        log.info("RocketMqCustomer 接收到消息：{}", JSON.toJSONString(message));
//        byte[] body = message.getBody();
//        String msg = new String(body);
//        log.info("RocketMqCustomer 接收到消息：{}", msg);
//
//    }
//
//}