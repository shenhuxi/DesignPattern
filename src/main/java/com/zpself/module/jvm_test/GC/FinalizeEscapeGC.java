package com.zpself.module.jvm_test.GC;

public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SINGLE_SELF ;

    public static void main(String[] args) throws InterruptedException {
        SINGLE_SELF = new FinalizeEscapeGC();
        SINGLE_SELF=null;
        System.gc();//有些启动可以设置手段调用无效： System.gc(); 因为会执行full gc  耗费性能
        Thread.sleep(500);//finalize执行优先级低；先睡0.5秒等他调用；
        if(SINGLE_SELF==null)
            System.out.println("我被回收了 ");
        else{
            System.out.println("我还活着 ");
        }

        System.out.println("第二次调用gc分割线--------------------------------");
        SINGLE_SELF=null;
        System.gc();//有些启动可以设置手段调用无效： System.gc();  因为会执行full gc  耗费性能
        Thread.sleep(500);//finalize执行优先级低；先睡0.5秒等他调用；
        if(SINGLE_SELF==null)
            System.out.println("我被回收了 ");
        else{
            System.out.println("我还活着 ");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        SINGLE_SELF =this;

        System.out.println("调用了 finalize 方法");
    }
}
