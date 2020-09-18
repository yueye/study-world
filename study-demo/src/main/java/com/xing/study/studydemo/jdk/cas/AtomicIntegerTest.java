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

import cn.hutool.core.lang.Console;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/10
 */
public class AtomicIntegerTest implements Runnable {

    private static AtomicInteger flag = new AtomicInteger();
//    private static AtomicStampedReference<Integer> flag1 = new AtomicStampedReference(0,0);

    public static void main(String[] args) {
        Console.log(flag.getAndIncrement());
        Console.log(flag.getAndIncrement());
    }

    @Override
    public void run() {


    }
}