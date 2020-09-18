/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: SDFDSF
 * Author:   liujx
 * Date:     2020/9/15 14:52
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.sync;

/**
 * 〈〉
 * <p>
 * 分析：将synchronized作用于一个给定的实例对象instance，即当前实例对象就是锁对象，
 * 每次当线程进入synchronized包裹的代码块时就会要求当前线程持有instance实例对象锁，
 * 如果当前有其他线程正持有该对象锁，那么新到的线程就必须等待，这样也就保证了每次只有一个线程执行i++;操作。
 * 当然除了instance作为对象外，我们还可以使用this对象(代表当前实例)或者当前类的class对象作为锁
 *
 * @author liujx16
 * @create 2020/9/15
 */
public class SynchronizedTest6 implements Runnable {
    //    static SynchronizedTest6 instance=new SynchronizedTest6();
    static int i = 0;

    @Override
    public void run() {
        //省略其他耗时操作....
        //使用同步代码块对变量i进行同步操作,锁对象为instance
//        synchronized(this){
//        synchronized(instance){
        synchronized (SynchronizedTest6.class) {
            for (int j = 0; j < 10000; j++) {
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest6 instance = new SynchronizedTest6();
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}