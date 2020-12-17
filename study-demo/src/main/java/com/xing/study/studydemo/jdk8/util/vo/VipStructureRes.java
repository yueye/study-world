/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: IqiyiVipStructureRes
 * Author:   liujx
 * Date:     2020/5/15 16:44
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
 * @create 2020/5/15
 * @desc 购买项会员类型
 */
@Data
public class VipStructureRes {
    /** 购买会员类型
     * （当内容为解锁内容时有意义；
     * 会员类型为5表示需要购买奇异果黄金会员，
     * 为54表示需要购买奇异果钻石会员，
     * 没有对接奇异果钻石会员的合作方无需关心54）*/
    private Integer supportVipType;
    /** 会员类型名称 */
    private String name;
}