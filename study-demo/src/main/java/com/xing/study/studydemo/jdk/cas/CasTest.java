/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: CasTest
 * Author:   liujx
 * Date:     2020/9/10 14:15
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/10
 */
public class CasTest {
    //    private static int count = 0;
    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //每个线程让count自增100次
                    for (int i = 0; i < 100; i++) {
//                        synchronized (CasTest.class) {
                        count.incrementAndGet();
//                        }
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}