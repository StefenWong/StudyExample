/**
 * 作者： wanglei
 * 创建时间： 2020/8/4 19:16
 * 类描述： 改进为泛型的，就在具体类实现CompareTo方法的时候里面不用做类型转换
 */
@FunctionalInterface
public interface ComparableSelf2 <T>{
    public int CompareTo(T t1, T t2);

    //1.8 函数是接口可以有默认实现方法了 这个方法可以有多个
    default void defaultMethod(){
        System.out.println("默认犯法噶");
    }
}
