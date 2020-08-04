/**
 * 作者： wanglei
 * 创建时间： 2020/8/4 19:01
 * 类描述：
 */
public class Dog implements ComparableSelf2<Dog> {
    int food;

    public Dog(int food) {
        this.food = food;
    }


    @Override
    public int CompareTo(Dog o) {
        //Dog dog = (Dog) o;
        if (this.food < o.food) return -1;
        else if(this.food > o.food) return 1;
        else  return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
