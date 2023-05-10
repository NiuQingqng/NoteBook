### 多线程相关
概念  线程安全  线程生命周期与状态
常用操作方法  等待与唤醒   线程池

synchronized
类锁
对象锁
可重入锁
修饰方法、代码块
重量级

Lock
ReentrantLock
手动加锁与释放   更加灵活
lock.lock();
try {
// synchronized do something
count += n;
} finally {
lock.unlock();
}
轻量级
可重入
公平锁和非公平锁
4种获取锁的方式 阻塞  轮询  限时轮询  可中断
在jdk1.5里面，ReentrantLock的性能是明显优于synchronized的，但是在jdk1.6里面，synchronized做了优化，他们之间的性能差别已经不明显了。

volatile
修饰属性 用来修饰会被不同线程访问和修改的变量  轻量同步机制
保证可见性、有序性  不保证原子性

### 20230506 排序算法、docker
- 6种排序算法回顾
- docker镜像、容器知识回顾
- docker的安装常用命令练习

### 20230508 线程池
- 线程池相关结构学习

  Executor 
  - -> ExecutorService 
    -> AbstractExecutorService 
      -> ThreadPoolExecutor(最常用)
  - -> ScheduledExecutorService(延迟或定时)
      ->ScheduledThreadPoolExecuto extends ThreadPoolExecutor
- 常用配置练习

test