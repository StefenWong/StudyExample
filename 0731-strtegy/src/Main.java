import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1,
//        int[] a = {4,23,45,12,5,67,1,23,12,999,22};
//        Sorter sorter = new Sorter();
//        //int[] rel = sorter.sort(a);
//        //Arrays.stream(rel).forEach(System.out::println);
//        sorter.sort1(a);
//        System.out.println(Arrays.toString(a));


        //2，
        //Sorter sorter = new Sorter();
        //Cat[] cats = {new Cat(100,199), new Cat(200,299), new Cat(22,33)};
        //sorter.Catsort(cats);
        //System.out.println(cats);
        //System.out.println(Arrays.toString(cats));
        Sorter<Dog> sorter = new Sorter<>();//直接Sorter sorter = new Sorter();这样也行
        Dog[] dogs = {new Dog(98),new Dog(23), new Dog(-45), new Dog(78)};
        //传递排序类型数组  以及  排序策略
        sorter.Comsort(dogs,new DogCompareSelf2());
        System.out.println(Arrays.toString(dogs));


        //3
//        Cat[] cats = {new Cat(100,199), new Cat(200,299), new Cat(22,33)};
//        Sorter<Cat> sorter1 = new Sorter<>();
//        sorter1.Comsort(cats, new CatWeightCompareSelf2());
//        System.out.println(Arrays.toString(cats));

        //4,
        //不传递实现类new CatWeightCompareSelf2()    sort方法传递的第二个参数是一个接口，并且正好这个接口只有一个方法，所以可以些微lamda表达式
        Cat[] cats = {new Cat(100,199), new Cat(200,299), new Cat(22,33)};
        Sorter<Cat> sorter1 = new Sorter<>();
        sorter1.Comsort(cats, (t1 , t2) -> {
            if (t1.WEIGHT < t2.WEIGHT) return 1;
            else  if(t1.WEIGHT > t2.WEIGHT) return  -1;
            else  return 0;
        });
        System.out.println(Arrays.toString(cats));




    }
}
