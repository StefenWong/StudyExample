//排序器
public class Sorter {
    // 自己凭借记忆写的排序
     public int[] sort(int [] a) {
         for (int i = 0; i < a.length; i++) {
             int temp ;
             for (int j = i + 1; j <a.length ; j++) {
                 if (a[j] < a[i]) {
                     temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
         }
         return a;
    }


    //2，选择排序
    public void sort1( int[] a){
        for (int i = 0; i <a.length - 1 ; i++) {
            int minpos = i;
            for (int j = i + 1; j < a.length ; j++) {
                //a[j] < a[i] ? j : i  这样是不行的，一开始满足，换了minpos换了一个，后来不满足的时候，又把最小位置的值变回i了
                //minpos = a[j] < a[i] ? j : minpos;  这样也不行，最后没成功排序。原因在于后面的数始终在和啊【i】比较，而不是更新的新的最小的
                minpos = a[j] < a[minpos] ? j : minpos;
            }
            //最终确定了当前i 之后的哪一个位置的比i的小，再交换
            swap(a,i,minpos);
        }
    }
    private void swap(int[] a, int i, int minpos) {
         int temp = a[i];
         a[i] = a[minpos];
         a[minpos] = temp;
    }





    //3，增加猫的排序方法  现在除了实现了int数组的比较，还有猫数组的排序
    public void Catsort( Cat[] a){
        for (int i = 0; i <a.length - 1 ; i++) {
            int minpos = i;
            for (int j = i + 1; j < a.length ; j++) {
                //a[j] < a[i] ? j : i  这样是不行的，一开始满足，换了minpos换了一个，后来不满足的时候，又把最小位置的值变回i了
                //minpos = a[j] < a[i] ? j : minpos;  这样也不行，最后没成功排序。原因在于后面的数始终在和【i】比较，而不是更新的新的最小的
                minpos = a[j].compareTo(a[minpos]) == -1  ? j : minpos;
            }
            //最终确定了当前i 之后的哪一个位置的比i的小，再交换
            Catswap(a,i,minpos);
        }
    }

    private void Catswap(Cat[] a, int i, int minpos) {
        Cat temp = a[i];
        a[i] = a[minpos];
        a[minpos] = temp;
    }


}
