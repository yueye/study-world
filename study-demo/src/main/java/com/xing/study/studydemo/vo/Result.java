/**
 * Copyright (C), 2015-2020, 联想（北京）有限公司
 * FileName: sdfdf
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
public class Result {
    public static String _vip = "";
    public Result() {
        super();
        this.code = 0;
        this.msg = "成功";
    }
    public Result(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    protected int code;
    protected String msg;
    protected String lvip = _vip;

    public int getCode() {
        return code;
    }
    public void setResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLvip() {
        return lvip;
    }
    public void setLvip(String lvip) {
        this.lvip = lvip;
    }
    @Override
    public String toString() {
        return "Result [code=" + code + ", msg=" + msg + "]";
    }


}