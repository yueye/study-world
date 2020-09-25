/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdfdsf
 * Author:   liujx
 * Date:     2020/9/21 16:46
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/21
 */
public class Consumer {

    public static void main(String[] args) throws MQClientException {
        // 这里填写group名字
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(Constans.ROCKETMQ_GROUP);
        // NameServer地址
        consumer.setNamesrvAddr("localhost:9876");
        //1：topic名字 2：tag名字
        consumer.subscribe(Constans.ROCKETMQ_TOPIC, Constans.ROCKETMQ_TAG);
        consumer.registerMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            for (MessageExt msg : msgs) {
                System.out.println(System.currentTimeMillis()+" "+new String(msg.getBody()));
            }
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();
        System.out.println("Consumer Started!");

    }
}