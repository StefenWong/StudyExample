//针对上例子修改
//简单的办法就是加锁 ，当然，效率降低了
public class Singleton04 {

    //下面变量不能加final，final的变量必须初始化
    private static Singleton04 instance;

    private Singleton04() {
    }

    //这里锁定的是Singleton04这个class，锁的是class
    //效率的降低就在这里，每次都判断石佛有锁
    public static synchronized Singleton04  getInstance(){
        //在这里的if判断出容易出现线程不安全现象
        if (instance == null) {
            // 模拟线程短暂停止
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Singleton04();
        }

        return instance;
    }

    public static void main(String[] args) {
        //模拟100个线程创建单例
        for (int i = 0; i < 100; i++) {
            //thread方法里面本是一个runnerble，而runnerble是一个函数是接口，只有一个方法抽象，所以可以利用lamda表达式的写法
            new Thread(() -> {
                System.out.println(Singleton04.getInstance().toString());
            }).start();//线程的start方法别忘记，线程总得开始呀！！！
        }
    }



}
