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
import cn.hutool.core.util.IdcardUtil;
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
        // 唯一ID工具-IdUtil
        Console.log(IdUtil.fastSimpleUUID());
        Console.log(IdUtil.getSnowflake(1L,1L).nextId());

        // 随机数工具
        Console.log(RandomUtil.randomLong());

        // 日期工具
        Console.log(DateUtil.formatDateTime(new Date()));

        // 身份证工具
        Console.log(IdcardUtil.isValidCard("441502198810055038"));
        Console.log(IdcardUtil.getProvinceByIdCard("441502198810055038"));
        Console.log(IdcardUtil.getAgeByIdCard("441502198810055038"));
        Console.log(IdcardUtil.getGenderByIdCard("370829195708293252"));

    }
}