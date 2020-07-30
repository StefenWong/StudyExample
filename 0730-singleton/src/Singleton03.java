//懒汉式  什么时候用，什么时候初始化
//缺点：线程不安全

public class Singleton03 {

    //下面变量不能加final，final的变量必须初始化
    private static Singleton03 instance;

    private Singleton03() {
    }

    public static   Singleton03 getInstance(){
        //在这里的if判断出容易出现线程不安全现象
        if (instance == null) {
            // 模拟线程短暂停止
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Singleton03();
        }

        return instance;
    }

    public static void main(String[] args) {
        //模拟100个线程创建单例
        for (int i = 0; i < 100; i++) {
            //thread方法里面本是一个runnerble，而runnerble是一个函数是接口，只有一个方法抽象，所以可以利用lamda表达式的写法
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().toString());
            }).start();//线程的start方法别忘记，线程总的开始呀！！！
        }
    }



}
