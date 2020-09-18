/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdfdf
 * Author:   liujx
 * Date:     2020/7/30 11:33
 * Description:
 * History:
 * 描述
 */
package com.xing.study.studydemo.sf;

/**
 * 〈〉
 *
 * @author liujx
 * @create 2020/7/30
 */

/**
 * 威尔逊得分(Wilson Score)排序算法
 *
 * @author lzhpo
 */
public class WilsonScoreDemo1 {

    /**
     * 计算威尔逊得分
     * <p>
     * zP一般取值2即可，即95%的置信度。
     * </p>
     *
     * @param u  好评数
     * @param n  评论总数
     * @param zP 正态分布的分位数
     * @return s 威尔逊得分
     */
    public static double wilsonScore(double u, double n, double zP) {
        // 好评率
        double p = u / n;
        System.out.println("好评率为：" + p);
        // 威尔逊得分
        double s = (p + (Math.pow(zP, 2) / (2. * n)) - ((zP / (2. * n)) * Math.sqrt(4. * n * (1. - p) * p + Math.pow(zP, 2)))) / (1. + Math.pow(zP, 2) / n);
        System.out.println("威尔逊得分为：" + s);
        return s;
    }

    public static void main(String[] args) {
        // 计算结果：0.46844027984510983
        System.out.println(wilsonScore(500, 1000, 2));
    }

}