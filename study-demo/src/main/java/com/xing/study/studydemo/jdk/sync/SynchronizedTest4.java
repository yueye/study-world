/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdfdf
 * Author:   liujx
 * Date:     2020/9/15 14:46
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.sync;

/**
 * 〈〉
 * 当多个线程作用于不同的对象
 * 分析：因为两个线程作用于不同的对象，获得的是不同的锁，所以互相并不影响
 *
 * @author liujx16
 * @create 2020/9/15
 */
public class SynchronizedTest4 {
    public synchronized void method1() {
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public synchronized void method2() {
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }


    public static void main(String[] args) {
        final SynchronizedTest4 test1 = new SynchronizedTest4();
        final SynchronizedTest4 test2 = new SynchronizedTest4();

        new Thread(test1::method1).start();

        new Thread(test2::method2).start();
    }

}