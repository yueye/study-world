/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdf
 * Author:   liujx
 * Date:     2020/7/16 10:17
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.util;

import cn.hutool.core.lang.Console;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 〈〉
 *
 * @author liujx
 * @create 2020/7/16
 */
public class StackDemo {

    static void showpush(Stack<Integer> st, int a) {
        st.push(new Integer(a));
        Console.log("push(" + a + ")");
        Console.log("stack: " + st);
    }

    static void showpop(Stack<Integer> st) {
        Console.log("pop -> ");
        Integer a = st.pop();
        Console.log(a);
        Console.log("stack: " + st);
    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        Console.log("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            Console.log("empty stack");
        }
        test(1);
    }

    public static void test(int x) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(x);
        s2.push(x);
        int p1 = s1.peek();
        int p2 = s2.peek();
        Console.log(p1 == p2);
        Console.log(s1.peek() == s2.peek());
    }
}