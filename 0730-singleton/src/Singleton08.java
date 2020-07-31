public enum Singleton08 {

    //java创始人写的最完美的一种：枚举单例
    //不经解决线程同步，还可以防止反序列化
    //序列化指的是反射获取类创建实例，枚举单例不会被反序列化，因为枚举类没有构造方法，所以反序列化只会返回instance这个值
    instance;

    public void m(){} //这些表示业务方法

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //thread方法里面本是一个runnerble，而runnerble是一个函数是接口，只有一个方法抽象，所以可以利用lamda表达式的写法
            new Thread(() -> {
                System.out.println(Singleton08.instance.toString());
            }).start();//线程的start方法别忘记，线程总得开始呀！！！
        }
    }
}
