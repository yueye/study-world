/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: TimeIntervalTest
 * Author:   liujx
 * Date:     2020/11/4 16:35
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.hutool.date;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.lang.Console;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/11/4
 */
public class TimeIntervalTest {

    public static void main(String[] args) {
        TimeInterval timeInterval = DateUtil.timer();
        Console.log("nihao");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Console.log(timeInterval.intervalMs());
        Console.log("world");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Console.log(timeInterval.intervalMs());
    }
}