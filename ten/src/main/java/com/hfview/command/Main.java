package com.hfview.command;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * //TODO 写注释
 *
 * @author: zhw
 * @since: 2019/3/9 12:44
 */
public class Main {

    public static void main(String[] args) throws Exception{

        ExecutorService executorService = Executors.newFixedThreadPool(5);


        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":run");
            }
        });

       /* executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":run");
            }
        });*/

    }


}
