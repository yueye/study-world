/**
 * Copyright (C), 2015-2019, 联想（北京）有限公司
 * FileName: ListTest
 * Author:   liujx
 * Date:     2019/12/18 10:27
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.util;

import java.util.*;

/**
 * 〈〉
 *
 * @author liujx
 * @create 2019/12/18
 */
public class ListTest {
    public static void main(String[] args) {
        String[] s = new String[]{"1", "2"};
        List<String> list0 = new ArrayList<>();
        List<String> list = Arrays.asList(s);
        Set<String> set = new LinkedHashSet<>();
        set.addAll(list);
        list.add("3");
        list.add("4");
        System.out.println(list);
        System.out.println(set);

    }
}