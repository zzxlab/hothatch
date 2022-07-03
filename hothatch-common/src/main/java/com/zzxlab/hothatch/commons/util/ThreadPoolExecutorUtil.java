package com.zzxlab.hothatch.commons.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadPoolExecutorUtil {
    private static AtomicLong threadCounter = new AtomicLong();

    public final static ExecutorService EXECUTOR = new ThreadPoolExecutor(8, 20,
            30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100), r -> {
        final Thread thread = new Thread(r);
        thread.setDaemon(true);
        thread.setName("mq-hotHatch-thread-" + threadCounter.incrementAndGet());
        return thread;
    });

    public static void execute(Runnable command) {
        EXECUTOR.execute(command);
    }
}
