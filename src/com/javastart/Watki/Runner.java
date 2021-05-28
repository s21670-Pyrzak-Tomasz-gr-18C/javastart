package com.javastart.Watki;

public class Runner {
    public static void main(String[] args) {

//        Runnable [] runners = new Runnable[10];
//        Thread [] threads = new Thread[10];
//
//        for (int i = 0; i < 10; i++) {
//            runners[i] = new MyRun(i);
//        }

        MyRun run = new MyRun(1);
        MyRun run2 = new MyRun(2);
        Thread thread = new Thread(run);
        Thread thread2 = new Thread(run2);
        thread.start();
        thread2.start();

    }
}
