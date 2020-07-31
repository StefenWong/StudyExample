public class Singleton07 {

    public static final Singleton07 instance = new Singleton07();

    private Singleton07() {
    }

    //采取加一个静态内部内的方式，在里面初始化外面的07这个类
    //比第一个要好很多，01是只要加载就初始化了。这里07加载了，他的静态内部类Singleton07Hoder不会加载，只有在下面的getinstance调用的时候才会加载
    //jvm保证线程安全 类只加载一次
    private static class Singleton07Hoder {
        public static final Singleton07 instance = new Singleton07();
    }

    public static Singleton07 getInstance(){
        return  Singleton07Hoder.instance;
    }

    public static void main(String[] args) {
//        Singleton07 m1 = Singleton07.getInstance();  //new Singleton01();
//        Singleton07 m2 = Singleton07.getInstance();//new Singleton01();
//        System.out.println(m1==m2);
            //模拟100个线程创建单例
            for (int i = 0; i < 100; i++) {
                //thread方法里面本是一个runnerble，而runnerble是一个函数是接口，只有一个方法抽象，所以可以利用lamda表达式的写法
                new Thread(() -> {
                    System.out.println(Singleton07.getInstance().toString());
                }).start();//线程的start方法别忘记，线程总得开始呀！！！
            }

    }
}
