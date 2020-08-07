/**
 * 作者： wanglei
 * 创建时间： 2020/8/7 15:09
 * 类描述：
 */
public class Car  implements FactoryInterface{
    @Override
    public Car start() {
        System.out.println("Car 工具的方法");
        return new Car();
    }
}
