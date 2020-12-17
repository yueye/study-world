/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: StopWatchTest
 * Author:   liujx
 * Date:     2020/11/4 16:19
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.spring;

import cn.hutool.core.lang.Console;
import org.springframework.util.StopWatch;

/**
 * 〈〉
 * spring stopWatch
 * @author liujx16
 * @create 2020/11/4
 */
public class StopWatchTest {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch("test");
        stopWatch.start("task1");
        Console.log("nihao");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        stopWatch.start("task2");
        Console.log("world");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        Console.log(stopWatch.prettyPrint());
        Console.log(stopWatch.shortSummary());
    }
}