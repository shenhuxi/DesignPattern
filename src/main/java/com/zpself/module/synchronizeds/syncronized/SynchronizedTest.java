package com.zpself.module.aa.syncronized;

public class SynchronizedTest implements  {
    public synchronized void test1(){

    }

    public void test2(){
        synchronized (this){

        }
    }
}