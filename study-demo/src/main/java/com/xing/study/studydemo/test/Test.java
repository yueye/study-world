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

import java.util.UUID;

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
        Console.log(UUID.randomUUID().toString());
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