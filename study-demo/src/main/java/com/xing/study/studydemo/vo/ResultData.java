/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdfd
 * Author:   liujx
 * Date:     2020/12/9 14:38
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.vo;

/**
 * 〈〉
 *
 * @author liujx16
 * @create 2020/12/9
 */
public class ResultData<T> extends Result {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}