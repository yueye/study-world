/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: MyHashTable
 * Author:   liujx
 * Date:     2020/9/11 16:10
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.util;

import cn.hutool.core.lang.Console;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/11
 */
public class MyHashTable {
    private transient String[] table = new String[]{"0", "1"};

    public synchronized void put() {
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Console.log("睡醒啦");
        String[] t = table;
        t[0] = "00";
    }

    public synchronized String get() {
        Console.log("jinlaile");
        String[] t = table;
        return t[0];
    }
}