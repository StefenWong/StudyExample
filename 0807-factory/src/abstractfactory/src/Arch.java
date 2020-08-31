package abstractfactory.src;

public class Arch  extends  Weapon{
    @Override
    void shoot() {
        System.out.println("我是具体的武器Arch，继承自Weapon.");
    }
}
