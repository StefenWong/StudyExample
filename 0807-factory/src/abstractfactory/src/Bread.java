package abstractfactory.src;

public class Bread extends Food {
    @Override
    void energycontain() {
        System.out.println("我是具体的食物面包，继承自Food");
    }
}
