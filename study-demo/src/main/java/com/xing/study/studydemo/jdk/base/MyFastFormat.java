/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: AbsClass
 * Author:   liujx
 * Date:     2020/10/16 10:46
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk.base;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/10/16
 */
public class MyFastFormat extends MyFormat{
    private String var1;

    private static final MyFormatCache<MyFastFormat> CACHE = new MyFormatCache<MyFastFormat>() {
        protected MyFastFormat createInstance(String var1) {
            return new MyFastFormat(var1);
        }
    };

    public MyFastFormat(String var1) {
        this.var1 = var1;
    }
}