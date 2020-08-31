package abstractfactory.src;

public class Main {

    public static void main(String[] args) {
        //注意地方1：在用的时候是申明抽象工厂，并只想具体的工厂1，这个时候抽象工厂的方法实际返回的其实是具体工厂的镀锡
        AbstractFactory abstractFactory = new SpecificFactory1();
        abstractFactory.getFood().energycontain();
        abstractFactory.getVehicle().go();
        abstractFactory.getWeapon().shoot();



        //注意地方1：在用的时候是申明抽象工厂，并只想具体的工厂2，这个时候抽象工厂的方法实际返回的其实是具体工厂的镀锡
        AbstractFactory abstractFactory2 = new SpecialFactory2();
        abstractFactory2.getFood().energycontain();
        abstractFactory2.getVehicle().go();
        abstractFactory2.getWeapon().shoot();

        //上面抽象工厂的好处——这里的申明基本可以不用变，
        //有两个地方值得注意：第一，申明的是一个抽象工厂对象，指的是具体的工厂对象
        //2，抽象工厂的返回值是产品的抽象父类
    }
}
