package abstractfactory.src;

public class Gun extends Weapon {
    @Override
    void shoot() {
        System.out.println("我是具体的武器gun，继承自Weapon.");
    }
}
