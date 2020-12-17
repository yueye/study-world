/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: IqiyiTvRes
 * Author:   liujx
 * Date:     2020/4/20 11:16
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.jdk8.util.vo;

import lombok.Data;

/**
 * 〈〉
 *
 * @author liujx
 * @create 2020/4/20
 * @desc 解锁状态数据
 */
@Data
public class LockContent {
    /** 是否为解锁内容 0 不是解锁内容；1 是解锁内容 */
    private Integer lockContent;
    /** 点播解锁状态：1不能解锁；2可解锁；3已解锁（当内容为解锁内容时有意义；为1时说明用户不可购买单集解锁内容，需要开通会员或逐集解锁）*/
    private String vodUnLockable;
}