/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: Test
 * Author:   liujx
 * Date:     2020/9/25 13:23
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.test;

import cn.hutool.core.lang.Console;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/25
 */
public class Test {
    public static void main(String[] args) {
//        Console.log(new Test().aplusb(5,1));
//        char a = 'a';
//        Console.log(lowercaseToUppercase(a));
//        Console.log(UUID.randomUUID().toString());
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("222");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            Console.log(iterator.next());
        }
        List<String> linkedList = new LinkedList<>();
        linkedList.add("111");
        List<String> vector = new Vector<>();
        Map<String,String> hashMap = new HashMap<>();
        Map<String,String> hashtable = new Hashtable<>();

        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("v2/day01.xml"));
        applicationContext.getBean("111");
        // 异常
//        List<String> list = new ArrayList<>(10);
//        Console.log(list.size());
//        list.set(5,"10");
    }
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public static int aplusb(int a, int b) {
        // write your code here
        return ((a^b)+(a&b<<1));
    }

    public static char lowercaseToUppercase(char character) {
        return (char)(character-32);
    }
}