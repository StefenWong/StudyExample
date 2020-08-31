package abstractfactory.src;

public class SpecialFactory2  extends AbstractFactory{
    @Override
    Vehicle getVehicle() {
        return new Carriage();
    }

    @Override
    Food getFood() {
        return new JiaoZi();
    }

    @Override
    Weapon getWeapon() {
        return new Arch();
    }
}
