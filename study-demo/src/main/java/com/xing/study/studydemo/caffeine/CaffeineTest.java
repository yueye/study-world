/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: CaffeineTest
 * Author:   liujx
 * Date:     2020/12/16 9:30
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.caffeine;

import com.github.benmanes.caffeine.cache.AsyncLoadingCache;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/12/16
 */
public class CaffeineTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        hand();
        syn();
//        asyn();
    }

    private static void syn() {
        // 同步加载
        LoadingCache<String, Object> loadingCache = Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .recordStats()
                .build(key -> createTestValue2(key));
        String key = "test1";
        // 在获取指定key的值的时候
        // 如果没有获取到则通过在构建同步缓存的时候调用createTestValue方法写入方法值
        Object oj = loadingCache.get(key);
        System.out.println("oj : " + oj);
    }


    private static void asyn() throws ExecutionException, InterruptedException {
        // 异步加载
        AsyncLoadingCache<String, Object> asyncLoadingCache = Caffeine.newBuilder()
                .expireAfterWrite(60, TimeUnit.SECONDS)
                .buildAsync(key -> createTestValue1(key));
        String key = "test1";
        // 查询并且在指定的key不存在的时候，通过异步的方式来构建缓存，返回的是CompletableFuture
        CompletableFuture<Object> futrueOj = asyncLoadingCache.get(key);
        System.out.println(futrueOj.get().toString());
    }

    private static void hand() {
        Cache<String, Object> manualCache = Caffeine.newBuilder()
                .expireAfterWrite(5, TimeUnit.SECONDS)
                .build();
        String key = "test1";
        // 根据key查询一个缓存，如果没有则调用createTestValue方法将返回值写到缓存
        // 如果createTestValue方法返回空，则get方法返回空
        // 如果createTestValue方法抛出异常，则get方法返回异常
        Object oj = manualCache.get(key, k -> createTestValue());
        System.out.println("oj = " + oj);
        // 将一个值写入缓存，如果存在就会覆盖掉已经存在的值
        manualCache.put(key, "hello world.");
        oj = manualCache.getIfPresent(key);
        System.out.println("oj = " + oj);
        // 删除一个缓存
        manualCache.invalidate(key);
        oj = manualCache.getIfPresent(key);
        System.out.println("oj = " + oj);
    }

    private static Object createTestValue() {
        return null;
    }

    private static Object createTestValue1(String k) {
        return "jingjing say: hello world.";
    }

    private static Object createTestValue2(String k) {
        return k;
    }
}