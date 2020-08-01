/**
 * 作者： wanglei
 * 创建时间： 2020/8/1 15:19
 * 类描述：
 */
public class Cat {
    int WEIGHT;
    int HEIGHT;

    public Cat(int WEIGHT, int HEIGHT) {
        this.WEIGHT = WEIGHT;
        this.HEIGHT = HEIGHT;
    }

    //增加猫比较大小的方法，比较重量
    public int compareTo(Cat C){
        if(this.WEIGHT < C.WEIGHT){
            return -1;
        }else if (this.WEIGHT > C.WEIGHT) {
            return  1;
        } else {
            return  0;
        }
    }

}
