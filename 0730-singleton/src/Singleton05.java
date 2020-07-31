//针对上例子修改
//简单的办法就是加锁
public class Singleton05 {

    //下面变量不能加final，final的变量必须初始化
    private static Singleton05 instance;

    private Singleton05() {
    }

    public static  Singleton05 getInstance(){
        if (instance == null) {
            //减少同步代码块来又加锁又避免效率降低，但是这样枷锁不行
            synchronized (Singleton05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new Singleton05();
            }

        }

        return instance;
    }

    public static void main(String[] args) {
        //模拟100个线程创建单例
        for (int i = 0; i < 100; i++) {
            //thread方法里面本是一个runnerble，而runnerble是一个函数是接口，只有一个方法抽象，所以可以利用lamda表达式的写法
            new Thread(() -> {
                System.out.println(Singleton05.getInstance().toString());
            }).start();//线程的start方法别忘记，线程总得开始呀！！！
        }
    }



}
