/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: OptionalTest
 * Author:   liujx
 * Date:     2020/11/5 9:40
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk8.util;

import cn.hutool.core.lang.Console;
import com.xing.study.studydemo.jdk8.util.vo.ContentData;
import com.xing.study.studydemo.jdk8.util.vo.StructureRes;

import java.util.Optional;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/11/5
 */
public class OptionalTest {

    public static void main(String[] args) {
        String str = null;
        Console.log(Optional.ofNullable(str).orElse("test"));
        Long s = null;

        Console.log(Optional.ofNullable(s).orElse(0L));
//        Optional.ofNullable(s).orElseThrow(()->new RuntimeException("hhahha"));
        StructureRes structureRes = null;
//        StructureRes structureRes = new StructureRes();
//        structureRes.setSaleExpired(2);
//        Optional.ofNullable(structureRes).orElseThrow(()->new RuntimeException("1111"));
        ContentData contentData = null;
        Console.log(Optional.ofNullable(contentData).map(cd->cd.getLockContent()).map(lc->lc.getLockContent()).orElse(null));
    }
}