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
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * 〈〉
 * 用于日志记录
 *
 * @author liujx16
 * @create 2020/9/21
 */
public class OnewayProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer(Constans.ROCKETMQ_GROUP);
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        for (int i=0;i<10;i++) {
            Person person = new Person(Long.valueOf(i+""),"msg-"+i);
            Message message = new Message(Constans.ROCKETMQ_TOPIC,Constans.ROCKETMQ_TAG, JSON.toJSONString(person).getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.sendOneway(message);
            Console.log(System.currentTimeMillis()+" Message sended");
        }
        producer.shutdown();
    }
}