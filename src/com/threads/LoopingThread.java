package com.threads;

/**
 * Created by rohan on 5/4/16.
 */
public class LoopingThread implements Runnable {
    @Override
    public void run() {
//        for(int i = 0; i < 1000 ; i++){
            try {
                Thread.sleep(1000);

            }catch (InterruptedException ie){

            }
            System.out.println("Looping thread");
//        }
    }
}
