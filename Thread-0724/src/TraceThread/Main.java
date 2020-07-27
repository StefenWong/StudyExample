package TraceThread;

import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        TraceThreadPoolExecutor traceThreadPoolExecutor = new TraceThreadPoolExecutor(0,10,0L,TimeUnit.MILLISECONDS,new SynchronousQueue<>());
        for (int i = 0; i < 5; i++) {
            // 1，使用submit,不会打印异常堆栈信息  被除数为0的时候不会提示
             traceThreadPoolExecutor.submit(new DivTask2(100,i));


            // 2， 使用execute
            //threadPoolExecutor.execute(new DivTask(100,i));


            //3.改造的submit（）
//            Future furure = traceThreadPoolExecutor.submit(new DivTask(100,i));
//            furure.get();
        }
    }
}
