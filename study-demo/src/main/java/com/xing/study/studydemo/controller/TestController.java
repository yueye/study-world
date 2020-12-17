/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: TestController
 * Author:   liujx
 * Date:     2020/10/20 11:11
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.controller;

import com.xing.study.studydemo.vo.Person;
import com.xing.study.studydemo.vo.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/10/20
 */
@Api(tags = "TestController",description="测试类")
@RestController
public class TestController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public Object hello() {
        return "hello world";
    }

    @RequestMapping(value = "exe", method = {RequestMethod.GET,RequestMethod.POST})
    public Object exe(@RequestParam(value ="var1" ) @ApiParam("参数1") String var1,
                      @RequestParam(value ="var2" ) @ApiParam("参数2") String var2) {
        return "hello world "+var1+"--"+var2;
    }

    @RequestMapping(value = "exe1", method = {RequestMethod.GET,RequestMethod.POST})
    public Object exe() {
        ResultData<Person> resultData = new ResultData<>();
        Person person = new Person();
        person.setId(1L);
        person.setName("test1");
        person.setAge(10L);
        person.setCdate(new Date());
        resultData.setData(person);
        return resultData;
    }
}