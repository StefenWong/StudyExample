/**
 * 作者： wanglei
 * 创建时间： 2020/8/7 15:11
 * 类描述：
 */
public class Flane  implements FactoryInterface{
    @Override
    public FactoryInterface start() {
        System.out.println("飞机类的方法");
        return new Flane();
    }
}
