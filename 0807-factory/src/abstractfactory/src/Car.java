package abstractfactory.src;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/18 13:54
 * 类描述：
 */
public class Car implements Vechicle {
    @Override
    public void go() {
        System.out.println("Car go....");
    }
}
