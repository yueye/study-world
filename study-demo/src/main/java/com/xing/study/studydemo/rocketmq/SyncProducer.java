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

import cn.hutool.core.lang.Console;
import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/21
 */
public class SyncProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer(Constans.ROCKETMQ_GROUP);
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        List<Message> messages = new ArrayList<>();
        for (int i=0;i<10;i++) {
            Person person = new Person(Long.valueOf(i+""),"msg-"+i);
            Message message = new Message(Constans.ROCKETMQ_TOPIC,Constans.ROCKETMQ_TAG, JSON.toJSONString(person).getBytes(RemotingHelper.DEFAULT_CHARSET));
            messages.add(message);
        }
        SendResult sendResult = producer.send(messages);
        Console.log(System.currentTimeMillis()+" Message sended {}", sendResult);

        producer.shutdown();
    }
}