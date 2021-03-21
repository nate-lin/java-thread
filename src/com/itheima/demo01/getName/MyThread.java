package com.itheima.demo01.getName;

/**
 * @date Created by 林春燕 on 2021/3/21 16:58
 * @微信公众号 浅悦的编程时光
 * @博客 https://nate-lin.gitee.io
 * @GitHub https://github.com/nate-lin
 * @Gitee https://gitee.com/nate-lin
 */
/*
    获取线程的名称：
        1.使用Thread类中的方法GetName()
            String getName()返回该线程的名称
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
            static Thread currentThread()返回当前正在执行的线程对象的引用。
*/

//定义一个Thread类的子类
public class MyThread extends Thread{
    //重写Thread类中的run方法，设置线程任务
    @Override
    public void run(){
        //获取线程名称
        //String name=getName();
        //System.out.println(name);

        Thread t=Thread.currentThread();
        System.out.println(t);

        String name=t.getName();
        System.out.println(name);

        //链式编程
        System.out.println(Thread.currentThread().getName());

    }
}
