//package com.xing.study.studydemo.rocketmq.spring;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQReplyListener;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//@RocketMQMessageListener(topic = "queue_test_topic1", selectorExpression="tag1",consumerGroup = "queue_group_test1")
//public class RocketMqCustomer1 implements RocketMQReplyListener<MessageExt, ConsumeConcurrentlyStatus> {
//
//    @Override
//    public ConsumeConcurrentlyStatus onMessage(MessageExt message) {
//        byte[] body = message.getBody();
//        String msg = new String(body);
//        log.info("RocketMqCustomer1 接收到消息：{}", msg);
//        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//
//    }
//
//}