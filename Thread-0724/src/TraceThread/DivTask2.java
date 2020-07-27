package TraceThread;

public class DivTask2 implements  Runnable{
    int a , b;
    public DivTask2(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void run() {
        double resul = a/b;
        System.out.println(resul);
    }
}


