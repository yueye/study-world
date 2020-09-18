/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdf
 * Author:   liujx
 * Date:     2020/9/15 14:39
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.sync;

/**
 * 〈〉
 * 一个线程获取了该对象的锁之后，其他线程来访问其他synchronized实例方法
 * 分析：可以看出其他线程来访问synchronized修饰的其他方法时需要等待线程1先把锁释放
 *
 * @author liujx16
 * @create 2020/9/15
 */
public class SynchronizedTest2 {
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
        SynchronizedTest2 test = new SynchronizedTest2();

        new Thread(test::method1).start();

        new Thread(test::method2).start();
    }

}