/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: Person
 * Author:   liujx
 * Date:     2020/12/9 14:36
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * 〈修改springBoot默认的json序列化工具〉
 *
 * @author liujx16
 * @create 2020/12/9
 * springBoot默认json工具为jackson
 * 修改为fastjson
 * 1、bean注入HttpMessageConverters
 * 2、继承WebMvcConfigurerAdapter，重写configureMessageConverters方法 当前使用方法
 * 忽略某个属性
 * jackson：@JsonIgnore
 * fastjson：@JSONField(serialize = false)
 */
@Data
public class Person {
    private Long id;
    private String name;
    /** fastjson方式不序列化 不输出 jackson为springBoot默认的json序列化*/
    @JSONField(serialize = false)
    private Long age;
    private String head = "";
    private Long bd;
    private Date cdate;
}