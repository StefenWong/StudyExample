/**
 * 作者： wanglei
 * 创建时间： 2020/8/7 15:07
 * 类描述：
 */
public class main {
    public static void main(String[] args) {

        //1，简单工厂模式:当增加了工具的时候，需要再工厂方法里面增加相应方法！
        Car car1 = new SimpleVehicFactory().carCreate();

        //2，单独的工厂: 添加一个新交通工具，都要新建一个工厂
        FactoryInterface f = new CarFactory().createCar(); //需要什么就创建什么
        f.start();
        FactoryInterface f2 = new FlaneFactory().VehicleMethod();
        f2.start();



    }
}
