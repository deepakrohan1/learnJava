package com.threads;

/**
 * Created by rohan on 5/4/16.
 */
public class ThreadLearn extends Thread {
    String threadName = "";

    public ThreadLearn(String name){
        threadName = name;
    }

    @Override
    public void run() {

        System.out.println("This is thread");
    }
}
