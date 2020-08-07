/**
 * 作者： wanglei
 * 创建时间： 2020/8/7 15:31
 * 类描述：
 */
public class FlaneFactory implements FactoryInterface{
    @Override
    public FactoryInterface VehicleMethod() {
        //
        System.out.println("飞机的单独工厂方法");
        return new Flane();
    }
}
