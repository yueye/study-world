/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: HutoolTest
 * Author:   liujx
 * Date:     2020/9/18 15:35
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.hutool;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;

import java.util.Date;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/18
 */
public class HutoolTest {

    public static void main(String[] args) {
        Console.log("1111");
        Console.log(IdUtil.fastSimpleUUID());
        Console.log(IdUtil.getSnowflake(1L,1L).nextId());
        Console.log(RandomUtil.randomLong());
        Console.log(DateUtil.formatDateTime(new Date()));

    }
}