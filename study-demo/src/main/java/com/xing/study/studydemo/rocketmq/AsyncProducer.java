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

import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.CountDownLatch2;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.util.concurrent.TimeUnit;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/21
 */
public class AsyncProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer(Constans.ROCKETMQ_GROUP);
        producer.setNamesrvAddr("localhost:9876");
        producer.start();
        producer.setRetryTimesWhenSendFailed(0);
        int messageCount = 10;
        // 根据消息数量实例化倒计时计算器
        final CountDownLatch2 countDownLatch = new CountDownLatch2(messageCount);
        for (int i=0;i<10;i++) {
            final int index = i;
            Person person = new Person(Long.valueOf(i+""),"msg-"+i);
            Message message = new Message(Constans.ROCKETMQ_TOPIC,Constans.ROCKETMQ_TAG, JSON.toJSONString(person).getBytes(RemotingHelper.DEFAULT_CHARSET));
            // SendCallback接收异步返回结果的回调
            producer.send(message, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                    System.out.printf("%-10d OK %s %n",index,
                            sendResult.getMsgId());
                }
                @Override
                public void onException(Throwable e) {
                    System.out.printf("%-10d Exception %s %n", index, e);
                    e.printStackTrace();
                }
            });
        }
        // 等待5s
        countDownLatch.await(5, TimeUnit.SECONDS);
        // 如果不再发送消息，关闭Producer实例。
        producer.shutdown();
    }
}