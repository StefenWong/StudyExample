/**
 * 作者： wanglei
 * 创建时间： 2020/8/7 15:15
 * 类描述：
 */
public class CarFactory {
    public Car createCar(){
        System.out.println("car的单独工厂方法！");
        return  new Car();
    }
}
