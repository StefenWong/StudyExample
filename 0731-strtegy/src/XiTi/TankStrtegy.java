package XiTi;

//先定义一种策略
public interface TankStrtegy<T> {
    //假设这种策略是开火策略 todo
    void fire (T t);
}
