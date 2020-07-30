public class Singleton02 {

    public static final Singleton02 instance ;//

    // = new Singleton02();

    static {
        instance = new Singleton02();
    }

    private Singleton02() {
    }

    public static Singleton02 getInstance(){
        return  instance;
    }

    public static void main(String[] args) {
        Singleton02 m1 = Singleton02.getInstance();  //new Singleton01();
        Singleton02 m2 = Singleton02.getInstance();//new Singleton01();
        System.out.println(m1==m2);

    }
}
