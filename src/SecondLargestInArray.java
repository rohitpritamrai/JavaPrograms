import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArray {
    public static void main(String args []){
        int []arr ={18,2,23,12,90,17,5,55,6};
        int temp;
        int second = 0;

        for (int i=0; i< arr.length; i++) {
            int counter=0;
            temp = arr[i];
            for(int j=0; j< arr.length; j++){
                if((arr[j]>=temp)){
                   counter++;
                 }
                if(counter>2){
                  break;
                }
            }
            if(counter==2){
                second=temp;
            }
        }
        System.out.print("Second largest is "+second);
    }
}
