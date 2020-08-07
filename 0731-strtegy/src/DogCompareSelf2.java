public class DogCompareSelf2  implements ComparableSelf2<Dog>{
    @Override
    public int CompareTo(Dog o1,Dog o2) {
        if (o1.food < o2.food) return 1;
        else  if(o1.food > o2.food) return  -1;
        else  return 0;
    }
}
