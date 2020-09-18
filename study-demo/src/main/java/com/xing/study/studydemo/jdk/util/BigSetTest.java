/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: SetTest
 * Author:   liujx
 * Date:     2020/7/15 17:47
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.util;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * 〈〉
 *
 * @author liujx
 * @create 2020/7/15
 */
public class BigSetTest {
    public static void main(String[] args) {
//        test1();

        test2();
    }

    private static void test2() {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            int randomResult = random.nextInt(100000000);
            list.add(randomResult);
        }
        System.out.println("产生的随机数有");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        BitSet bitSet = new BitSet(100000000);
        for (int i = 0; i < 10000000; i++) {
            bitSet.set(list.get(i));
        }

        System.out.println("0~1亿不在上述随机数中有" + bitSet.cardinality());
        for (int i = 0; i < 100000000; i++) {
            if (!bitSet.get(i)) {
                System.out.println(i);
            }
        }
    }

    private static void test1() {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }
}