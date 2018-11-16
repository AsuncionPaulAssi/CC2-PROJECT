
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayLis {
    public static void main(String[] args) {
        int[] sort = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,23,24,25,26,27,28,29,30};

List<Integer> odd = new ArrayList<Integer>();
List<Integer> even = new ArrayList<Integer>();
for (int a : sort) {
    if ((a & 1) == 1) {
        odd.add(a);
    } else {
        even.add(a);
    }
}
Collections.sort(odd);
Collections.sort(even);
System.out.println("Odd:" + odd);
System.out.println("Even:" + even);
    }
}
