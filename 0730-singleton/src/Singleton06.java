//针对上例子修改
//简单的办法就是加锁


public class Singleton06 {

    //下面变量不能加final，final的变量必须初始化
    private static Singleton06 instance;

    private Singleton06() {
    }

    public static Singleton06 getInstance(){
        if (instance == null) {//---这个检查四有必要的，避免线程反复拿锁
            //减少同步代码块来又加锁又避免效率降低，但是这样枷锁不行
            //所以增加一个if 空 判断，双重检查
            synchronized (Singleton06.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton06();
                }

            }

        }

        return instance;
    }

    public static void main(String[] args) {
        //模拟100个线程创建单例
        for (int i = 0; i < 100; i++) {
            //thread方法里面本是一个runnerble，而runnerble是一个函数是接口，只有一个方法抽象，所以可以利用lamda表达式的写法
            new Thread(() -> {
                System.out.println(Singleton06.getInstance().toString());
            }).start();//线程的start方法别忘记，线程总得开始呀！！！
        }
    }



}
