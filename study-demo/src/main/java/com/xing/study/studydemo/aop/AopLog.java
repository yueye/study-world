/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: AopLog
 * Author:   liujx
 * Date:     2020/11/10 16:05
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.aop;

import cn.hutool.core.util.IdUtil;
import cn.hutool.http.useragent.UserAgent;
import cn.hutool.http.useragent.UserAgentUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Objects;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/11/10
 */
@Aspect
@Component
@Slf4j
public class AopLog {

//    private Logger log = LoggerFactory.getLogger(getClass().getName());

    private static final String START_TIME = "request-start";

    @Pointcut("execution(public * com.xing.study.studydemo.controller.*Controller.*(..))")
    public void log() {

    }

    @Before("log()")
    public void beforeLog(JoinPoint point) {
        String requestId = String.valueOf(IdUtil.randomUUID());
        MDC.put("requestId",requestId);
        Long start = System.currentTimeMillis();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(attributes).getRequest();
        request.setAttribute(START_TIME, start);
        log.info("【请求 URL】：{}", request.getRequestURL());
        log.info("【请求 IP】：{}", request.getRemoteAddr());
        log.info("【请求类名】：{}，【请求方法名】：{}", point.getSignature().getDeclaringTypeName(), point.getSignature().getName());
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("【请求参数】：{}，", JSONUtil.toJsonStr(parameterMap));
    }

    @Around("log()")
    public Object aroudLog(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();
        log.info("【返回值】：{}", JSONUtil.toJsonStr(result));
        return result;
    }

    @AfterReturning("log()")
    public void afterReturning() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(attributes).getRequest();

        Long start = (Long) request.getAttribute(START_TIME);
        Long end = System.currentTimeMillis();
        log.info("【请求耗时】：{}毫秒", end - start);

        String header = request.getHeader("User-Agent");
        UserAgent userAgent = UserAgentUtil.parse(header);
        log.info("【浏览器类型】：{}，【操作系统】：{}，【原始User-Agent】：{}", userAgent.getBrowser().toString(), userAgent.getOs().toString(), header);
        MDC.clear();
    }


}