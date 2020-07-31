public class Singleton01 {

    public static final Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance(){
        return  instance;
    }

    public void m(){} //这些表示业务方法

    public static void main(String[] args) {
        Singleton01 m1 = Singleton01.getInstance();  //new Singleton01();
        Singleton01 m2 = Singleton01.getInstance();//new Singleton01();
        System.out.println(m1==m2);

    }
}
