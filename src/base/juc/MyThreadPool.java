package base.juc;

import java.util.concurrent.*;

/**
 * 生成一个线程池
 * 三个比较常见的实现池fixedThreadPool、cachedThreadPool、scheduledThreadPool
 *
 * @author Niuniu
 * @date 2023/5/8
 */
public class MyThreadPool extends ThreadPoolExecutor {

    // 固定大小线程池
    public static final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

    // 缓存线程池使用时创建，不使用60秒后销毁
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    // 计划线程池
    public static final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

    public MyThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    public MyThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }

    public MyThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }

    public MyThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

    public MyThreadPool getThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        return new MyThreadPool(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }
}
