/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: MyHashTableMain
 * Author:   liujx
 * Date:     2020/9/11 16:13
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
public class MyHashTableMain {

    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                myHashTable.put();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Console.log(myHashTable.get());
            }
        });
        thread.start();
        thread1.start();
    }
}