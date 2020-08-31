package abstractfactory.src;

import abstractfactory.src.Food;
import abstractfactory.src.Vehicle;
import abstractfactory.src.Weapon;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/7 17:20
 * 类描述：抽象的工厂生产抽象的产品实现产品族
 */
public abstract class AbstractFactory {
    //生产抽象的产品
    abstract Vehicle getVehicle();
    abstract Food getFood();
    abstract Weapon getWeapon();
}
