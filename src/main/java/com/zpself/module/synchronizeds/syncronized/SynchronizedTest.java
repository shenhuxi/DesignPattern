package com.zpself.module.synchronizeds.syncronized;

public class SynchronizedTest {
    public synchronized void test1(){

    }

    public void test2(){
        synchronized (this){

        }
    }
}