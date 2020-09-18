/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: dsfdsf
 * Author:   liujx
 * Date:     2020/9/15 14:44
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.sync;

/**
 * 〈〉
 * 一个线程获取了该对象的锁之后，其他线程来访问其他非synchronized实例方法现象
 * 分析：当线程1还在执行时，线程2也执行了，所以当其他线程来访问非synchronized修饰的方法时是可以访问的
 *
 * @author liujx16
 * @create 2020/9/15
 */
public class SynchronizedTest3 {
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

    public void method2() {
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
        SynchronizedTest3 test = new SynchronizedTest3();

        new Thread(test::method1).start();
        new Thread(test::method2).start();
    }

}