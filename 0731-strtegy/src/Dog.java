/**
 * 作者： wanglei
 * 创建时间： 2020/8/4 19:01
 * 类描述：
 */
public class Dog implements ComparableSelf {
    int food;

    public Dog(int food) {
        this.food = food;
    }

//不在dog类·里面实现conpare方法，把比较方法作为策略写在
    @Override
    public int CompareTo(Object o) {
        Dog dog = (Dog) o;
        if (this.food < dog.food) return -1;
        else if(this.food > dog.food) return 1;
        else  return 0;
    }


//    @Override
//    public int CompareTo(Dog t1, Dog t2) {
//        return 0;
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }


}
