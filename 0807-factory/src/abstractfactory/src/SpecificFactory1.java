package abstractfactory.src;

public class SpecificFactory1 extends AbstractFactory  {
    //一个具体的工厂，生产具体的对象，继承自抽象的工厂
    @Override
    Vehicle getVehicle() {
        return new Car();
    }

    @Override
    Food getFood() {
        return new Bread();
    }

    @Override
    Weapon getWeapon() {
        return new Gun();
    }
}
