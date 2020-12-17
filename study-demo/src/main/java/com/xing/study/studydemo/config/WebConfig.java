/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdf
 * Author:   liujx
 * Date:     2020/12/9 14:28
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/12/9
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setCharset(Charset.forName("UTF-8"));
//        config.setDateFormat("yyyyMMdd HH:mm:ssS");
        //设置允许返回为null的属性
//        config.setSerializerFeatures(SerializerFeature.WriteMapNullValue);
        fastJsonConverter.setFastJsonConfig(config);
        List<MediaType> list = new ArrayList<>();
        list.add(MediaType.APPLICATION_JSON_UTF8);
        fastJsonConverter.setSupportedMediaTypes(list);
        converters.add(fastJsonConverter);
    }
}