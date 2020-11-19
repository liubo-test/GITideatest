package com.course.code;

import org.testng.annotations.*;

/**
 * @author liubo
 * @create 2020-11-19-14:11
 */
public class BasicAnnotion {
//    最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是测试用例执行前执行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是测试用例执行后执行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类运行前执行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是类运行后执行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是套件执行前执行的");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("这是套件执行后执行的");
    }
}
