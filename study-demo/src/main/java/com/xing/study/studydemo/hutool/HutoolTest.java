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
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.math.Money;
import cn.hutool.core.util.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/18
 */
public class HutoolTest {

    public static void main(String[] args) {
        // 唯一ID工具-IdUtil
        Console.log(IdUtil.fastSimpleUUID());
        Console.log(IdUtil.getSnowflake(1L,1L).nextId());

        // 随机数工具
        Console.log(RandomUtil.randomLong());

        // 日期工具
        Console.log(DateUtil.formatDateTime(new Date()));
        Console.log(DateUtil.currentSeconds());
        Console.log(DateUtil.current());
        Console.log(DateUtil.month(DateUtil.date())+1);
        Console.log(DateUtil.month(DateUtil.date())+1);
        Console.log(DateUtil.offsetDay(DateUtil.date(),1));
        Console.log(DateUtil.offsetMonth(DateUtil.date(),1));
        Console.log(DateUtil.yesterday());
        Console.log(DateUtil.now());

        // 身份证工具
        Console.log(IdcardUtil.isValidCard("441502198810055038"));
        Console.log(IdcardUtil.getProvinceByIdCard("441502198810055038"));
        Console.log(IdcardUtil.getAgeByIdCard("441502198810055038"));
        Console.log(IdcardUtil.getGenderByIdCard("370829195708293252"));
        Console.log(IdcardUtil.getGenderByIdCard("370829198609283271"));
        Console.log(IdcardUtil.getGenderByIdCard("110100196208153136"));

        // 验证工具
        Console.log(Validator.isEmail("3@126.com"));
        Console.log(Validator.isEmail("32126.com"));
        Console.log(Validator.isMobile("13212321231"));
        Console.log(Validator.isMobile("19212321231"));

        // 数字处理
        Console.log(NumberUtil.add("1.0","2"));

        Console.log(new Money("5.01").getAmount());
        Console.log(new Money("5.01").getCent());
        Console.log(PhoneUtil.hideBetween("13521900437"));

//        XmlUtil.xmlToBean(XmlUtil.readObjectFromXml(""), String.class);
        String path = "C:\\Users\\admin\\Desktop\\youku.txt";
        Map<String,String> map = new HashMap<>();
        map.put("code","111");
        map.put("result","33333");
        for (int i=0;i<100;i++) {
            FileUtil.appendString(i+" 你好呀 世界",path,"GBK");
            FileUtil.appendString("\n",path,"GBK");
            FileUtil.appendString(i+" 我很好 哇啊",path,"GBK");
            FileUtil.appendString("\n",path,"GBK");

        }

    }
}