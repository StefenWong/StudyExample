package abstractfactory.src;

public class Car  extends  Vehicle{

    @Override
    void go() {
        System.out.println("我是具体的汽车 ，继承自Vehicle");
    }
}
