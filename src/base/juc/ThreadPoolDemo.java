package base.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池示例
 *
 * @author Niuniu
 * @date 2023/5/8
 */
public class ThreadPoolDemo {

    public static final ThreadPoolDemo newThreadPoolDemo = new ThreadPoolDemo();

    public void fixedThreadPoolDemo() {
        //创建一个固定大小为5的线程池
        ExecutorService threadPool = MyThreadPool.fixedThreadPool;
        try {
            //提交10个任务给线程池执行
            for (int i = 1; i <= 10; i++) {
                int taskId = i;
                //使用lambda表达式提交一个任务给线程池执行
                threadPool.submit(() -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Task " + taskId + " is running on " + threadName);
                    try {
                        //模拟任务执行的时间
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + taskId + " is completed on " + threadName);
                });
            }
        } finally {
            //关闭线程池
            threadPool.shutdown();
        }
    }

    public void cachedThreadPoolDemo() {
        //创建一个固定大小为5的线程池
        ExecutorService threadPool = MyThreadPool.cachedThreadPool;

        try {
            //提交10个任务给线程池执行
            for (int i = 1; i <= 10; i++) {
                int taskId = i;
                //使用lambda表达式提交一个任务给线程池执行
                threadPool.submit(() -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Task " + taskId + " is running on " + threadName);
                    try {
                        //模拟任务执行的时间
                        Thread.sleep(2000);
                        threadPool.submit(() -> {
                            String insideTaskId = "inside" + taskId;
                            String insideThreadName = Thread.currentThread().getName();
                            System.out.println("Task " + insideTaskId + " is running on " + insideThreadName);
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + taskId + " is completed on " + threadName);
                });
            }
        } finally {
            //关闭线程池
            //threadPool.shutdown();
        }
    }

    public void scheduledThreadPoolDemo() {
        //创建一个固定大小为5的线程池
        ScheduledExecutorService threadPool = MyThreadPool.scheduledThreadPool;

        try {
            //提交10个任务给线程池执行
            for (int i = 1; i <= 10; i++) {
                int taskId = i;
                //使用lambda表达式提交一个任务给线程池执行
                threadPool.schedule(() -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Task " + taskId + " is running on " + threadName);
                    try {
                        //模拟任务执行的时间
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Task " + taskId + " is completed on " + threadName);
                }, 3, TimeUnit.SECONDS);
            }
        } finally {
            //关闭线程池
            threadPool.shutdown();
        }
    }
}
