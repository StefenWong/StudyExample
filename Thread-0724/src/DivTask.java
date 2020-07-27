import java.util.concurrent.*;

public class DivTask  implements  Runnable{
    int a , b;
    public DivTask(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void run() {
        double resul = a/b;
        System.out.println(resul);
    }
}


