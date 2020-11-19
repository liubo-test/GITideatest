package com.course.code;

import org.testng.annotations.Test;

/**
 * 忽略测试
 * @author liubo
 * @create 2020-11-19-15:12
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 运行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 运行");
    }
    @Test
    public void ignore3(){
        System.out.println("ignore3 运行");
    }
}
