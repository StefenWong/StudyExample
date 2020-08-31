package abstractfactory.src;

public class Carriage extends Vehicle {
    @Override
    void go() {
        System.out.println("我是具体的马车 ，继承自Vehicle");
    }
}
