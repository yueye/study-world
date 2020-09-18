/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: FastJsonTest
 * Author:   liujx
 * Date:     2020/9/18 16:04
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.json.fastjson;

import cn.hutool.core.lang.Console;
import com.alibaba.fastjson.JSON;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/9/18
 */
public class FastJsonTest {

    public static void main(String[] args) {
        Console.log(JSON.toJSONString(null));
    }
}