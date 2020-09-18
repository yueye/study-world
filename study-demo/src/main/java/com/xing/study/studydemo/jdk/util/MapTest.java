/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: MapTest
 * Author:   liujx
 * Date:     2020/7/15 16:35
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.util;

import cn.hutool.core.lang.Console;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈〉
 *
 * @author liujx
 * @create 2020/7/15
 */
public class MapTest {
    public static void main(String[] args) {
//        forMap();
//        hashMapSort();
//        treeMapSort();
//        valueSort();
//        hashMapSourceTest();
//        sizeTest();
//        hashTest();
//        hashTest2();
    }

    private static void hashTest2() {
        Map<String, String> hashMap = new HashMap();
        for (int i = 0; i < 100; i++) {
            String key = "key_" + i;
            if (i == 99) {
                Console.log("嘿嘿到了");
            }
            hashMap.put(key, key);
        }
    }

    private static void hashTest() {
        // % &
        Map<Integer, String> sets = new HashMap<>();
        Map<Integer, String> hashMap = new HashMap();
        for (int i = 0; i < 100; i++) {
            String key = "key_" + i;
            int hash = key.hashCode() ^ (key.hashCode() >>> 16);
//            if (hashMap.containsKey(hash)) {
//                Console.log("{}", hashMap.get(hash));
//                Console.log("{}", key);
//            } else {
            hashMap.put(hash, key);
//            }
//            Console.log("{}", hash);
            if (sets.containsKey(255 & hash)) {
                Console.log(sets.get(255 & hash));
                Console.log("now:{}", hash + "-" + key);
            }
            sets.put((255 & hash), hash + "-" + key);
//            Console.log("%-{} &-{}", hash%128, 127&hash);
        }
//        Console.log(hashMap.size());
//        Console.log(sets.size());

    }

    private static void sizeTest() {
        Console.log(1 << 30);
        Console.log(16 << 1);
    }

    private static void hashMapSourceTest() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.get("1");
        map.get("2");
        for (int i = 0; i < 11; i++) {
            map.put("1" + i, "1" + i);
        }
        map.get("1");
        Console.log(map.put("20", "20"));
        Console.log(map.put("20", "30"));
        Console.log(map.get("20"));
        map.get("10");
    }

//    private static void valueSort() {
//        Map<String, String> map = new TreeMap<String, String>();
//        map.put("b", "b");
//        map.put("a", "c");
//        map.put("c", "a");
//// 通过ArrayList构造函数把map.entrySet()转换成list
//        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
//// 通过比较器实现比较排序
//        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
//            @Override
//            public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
//                return mapping1.getValue().compareTo(mapping2.getValue());
//            }
//        });
//        for (String key : map.keySet()) {
//            System.out.println(key + " ：" + map.get(key));
//        }
//    }
//
//    private static void treeMapSort() {
//        Map<String, String> map = new TreeMap<String, String>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 降序排序
//                return o1.compareTo(o2);
//            }
//        });
//        map.put("b", "b");
//        map.put("a", "c");
//        map.put("c", "a");
//        for (String key : map.keySet()) {
//            System.out.println(key + " ：" + map.get(key));
//        }
//    }
//
//    private static void hashMapSort() {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("b", "b");
//        map.put("a", "c");
//        map.put("c", "a");
//// 通过ArrayList构造函数把map.entrySet()转换成list
//        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
//// 通过比较器实现比较排序
//        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
//            @Override
//            public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
//                return mapping1.getKey().compareTo(mapping2.getKey());
//            }
//        });
//        for (Map.Entry<String, String> mapping : list) {
//            System.out.println(mapping.getKey() + " ：" + mapping.getValue());
//        }
//    }
//
//    private static void forMap() {
//        // 初始化，10W次赋值
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < 100000; i++)
//            map.put(i, i);
//        /** 增强for循环，keySet迭代 **/
//        long start = System.currentTimeMillis();
//        for (Integer key : map.keySet()) {
//            map.get(key);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("增强for循环，keySet迭代 -> " + (end - start) + " ms");
//        /** 增强for循环，entrySet迭代 */
//        start = System.currentTimeMillis();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            entry.getKey();
//            entry.getValue();
//        }
//        end = System.currentTimeMillis();
//        System.out.println("增强for循环，entrySet迭代 -> " + (end - start) + " ms");
//        /** 迭代器，keySet迭代 **/
//        start = System.currentTimeMillis();
//        Iterator<Integer> iterator = map.keySet().iterator();
//        Integer key;
//        while (iterator.hasNext()) {
//            key = iterator.next();
//            map.get(key);
//        }
//        end = System.currentTimeMillis();
//        System.out.println("迭代器，keySet迭代 -> " + (end - start) + " ms");
//        /** 迭代器，entrySet迭代 **/
//        start = System.currentTimeMillis();
//        Iterator<Map.Entry<Integer, Integer>> iterator1 = map.entrySet().iterator();
//        Map.Entry<Integer, Integer> entry;
//        while (iterator1.hasNext()) {
//            entry = iterator1.next();
//            entry.getKey();
//            entry.getValue();
//        }
//        end = System.currentTimeMillis();
//        System.out.println("迭代器，entrySet迭代 -> " + (end - start) + " ms");
//    }
}