/**
 * 作者： wanglei
 * 创建时间： 2020/8/7 15:05
 * 类描述：简单交通更工具工厂  扩张型不好  （可以采用每种交通工具做一个工厂）
 */
public class SimpleVehicFactory {
    //创建轮船
    public  Car carCreate(){
        //前置业务处理代码·
        return new Car();
    }

    //创建飞机
    public Flane flaneCreate(){
        //y业务处理
        return   new Flane();
    }

    //



}
