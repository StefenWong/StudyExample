public enum Singleton08 {

    //java创始人写的最完美的一种：枚举单例
    //不经解决线程同步，还可以防止反序列化
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
