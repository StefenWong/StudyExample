public class CatWeightCompareSelf2 implements  ComparableSelf2<Cat> {
    @Override
    public int CompareTo(Cat t1, Cat t2) {
        if (t1.WEIGHT < t2.WEIGHT) return 1;
        else  if(t1.WEIGHT > t2.WEIGHT) return  -1;
        else  return 0;
    }
}
