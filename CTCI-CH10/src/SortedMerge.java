/**
 * Created by sanjanamanojkumar on 6/19/17.
 */
public class SortedMerge {

    public static void merge(int[] a, int[] b,int lastA, int lastB) {
        int asize = lastA-1;
        int bsize = lastB-1;
        int mergedsize = lastA+lastB -1;
        while(bsize>=0) {
            if(asize>=0 && a[asize] > b[bsize]){
                a[mergedsize] = a[asize];
                asize--;
                mergedsize--;
            }
            else {

                a[mergedsize] = b[bsize];
                bsize--;
                mergedsize--;
            }
        }
    }


    public static void main(String[] args){
        int[] a = new int[10];
        a[0] = 2;
        a[1] = 5;
        a[2] = 7;
        a[3] = 8;
         int[] b = {1,3,4,6,9,10};
         merge(a,b,4,6);
         for(int i :a) {
             System.out.println(i);
         }
    }
    }
