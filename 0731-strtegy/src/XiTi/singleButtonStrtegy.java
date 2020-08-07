package XiTi;

public class singleButtonStrtegy implements TankStrtegy<SingButonCls> {
    @Override
    public void fire(SingButonCls singButonCls) {
        System.out.printf("单枪打出 {} 子弹",singButonCls.button);

    }
}
