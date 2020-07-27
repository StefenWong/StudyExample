package TraceThread;

import java.util.concurrent.*;

public class TraceThreadPoolExecutor extends ThreadPoolExecutor {

    //原始的threadpoolExcutor无法看到在那儿提交任务，改写threadpollExecutor
    //改写目的是：增加打印的堆栈信息，方便定位！！！！

    public TraceThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    @Override
    public void execute(Runnable command) {
        super.execute(wrap(command, printTrace(),Thread.currentThread().getName()));
    }

    @Override
    public Future<?> submit(Runnable task) {
        return super.submit(wrap(task,printTrace(),Thread.currentThread().getName()));
    }

    private  Exception printTrace(){
        return  new Exception("Client stack write here");
    }

    private Runnable wrap(final Runnable task, final Exception clientStack, String clientThreadName) {
        return  new Runnable() {
            @Override
            public void run() {
                try {
                    task.run();
                }catch (Exception ex) {
                    clientStack.printStackTrace();
                    throw ex;
                }
            }
        };
    }
}
