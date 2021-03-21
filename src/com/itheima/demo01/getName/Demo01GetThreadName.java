package com.itheima.demo01.getName;

/**
 * @date Created by 林春燕 on 2021/3/21 16:58
 * @微信公众号 浅悦的编程时光
 * @博客 https://nate-lin.gitee.io
 * @GitHub https://github.com/nate-lin
 * @Gitee https://gitee.com/nate-lin
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt=new MyThread();
        //调用start方法，开启新线程，执行run方法
        mt.start();

        new MyThread().start();
        new MyThread().start();

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
