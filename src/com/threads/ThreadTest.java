package com.threads;

/**
 * Created by rohan on 5/4/16.
 */
public class ThreadTest {

    public static void main(String[] args) {
        Runnable lp = new LoopingThread();
        Thread mn = new Thread(lp,"test");
        mn.start();
        System.out.println(Thread.currentThread());
        ThreadLearn tl = new ThreadLearn("test lersn");
        tl.start();
        System.out.println(Thread.currentThread());

    }
}
