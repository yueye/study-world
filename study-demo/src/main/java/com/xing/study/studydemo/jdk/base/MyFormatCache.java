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
public abstract class MyFormatCache<F extends MyFormat> {

    protected abstract F createInstance(String var1);

}