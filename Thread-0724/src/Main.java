import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(5), Executors.defaultThreadFactory(), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println(r.toString() + "被拒绝执行");
            }
        });

        for (int i = 0; i < 5; i++) {
            // 1，使用submit,不会打印异常堆栈信息  被除数为0的时候不会提示
            // threadPoolExecutor.submit(new DivTask(100,i));


            // 2， 使用execute
            //threadPoolExecutor.execute(new DivTask(100,i));


            //3.改造的submit（）
            Future furure = threadPoolExecutor.submit(new DivTask(100,i));
            furure.get();
        }
    }
}
