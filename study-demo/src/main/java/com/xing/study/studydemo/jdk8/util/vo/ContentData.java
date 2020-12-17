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

import java.util.List;

/**
 * 〈〉
 *
 * @author liujx
 * @create 2020/4/20
 */
@Data
public class ContentData {
    private LockContent lockContent;
    private List<VipStructureRes> vipStructureResList;
    /** 单点（点播） */
    private StructureRes vodStructureRes;
    /** 套餐（点播） */
    private StructureRes productPacketStructureRes;
}