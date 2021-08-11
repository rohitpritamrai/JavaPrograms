import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArray {
    public static void main(String args []){
        int []arr ={1,2,3,4,5,6,7,8,9,10};

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        System.out.println("2nd Largest element is "+list.get(list.size()-2));
    }
}
