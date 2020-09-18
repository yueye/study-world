/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdfds
 * Author:   liujx
 * Date:     2020/9/10 14:25
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.cas;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/10
 */
public class AtomicBooleanTest implements Runnable {

    private static AtomicBoolean flag = new AtomicBoolean(true);
//    private static AtomicBoolean flag = new AtomicBoolean(true);

    public static void main(String[] args) {
        AtomicBooleanTest ast = new AtomicBooleanTest();
        Thread thread1 = new Thread(ast);
        Thread thread = new Thread(ast);
        thread1.start();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("thread:" + Thread.currentThread().getName() + ";flag:" + flag.get());
        if (flag.compareAndSet(true, false)) {
            System.out.println(Thread.currentThread().getName() + "----" + flag.get());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag.set(true);
        } else {
            System.out.println("重试机制thread:" + Thread.currentThread().getName() + ";flag:" + flag.get());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            run();
        }

    }
}