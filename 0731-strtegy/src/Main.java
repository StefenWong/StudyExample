import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] a = {4,23,45,12,5,67,1,23,12,999,22};
//        Sorter sorter = new Sorter();
//        //int[] rel = sorter.sort(a);
//        //Arrays.stream(rel).forEach(System.out::println);
//        sorter.sort1(a);
//        System.out.println(Arrays.toString(a));


        Sorter sorter = new Sorter();
        Cat[] cats = {new Cat(100,199), new Cat(200,299), new Cat(22,33)};
        sorter.Catsort(cats);
        //System.out.println(cats);
        System.out.println(Arrays.toString(cats));
    }
}
