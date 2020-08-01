/**
 * 作者： wanglei
 * 创建时间： 2020/8/1 15:42
 * 类描述：自己写的compareable接口，仿照Comparable类的
 * 所有现需要排序的，比如猫啊，狗啊，之类额度都需要实现这个接口，重写排序方法
 */
public interface ComparableSelf {
    public int CompareTo(Object o);
}
