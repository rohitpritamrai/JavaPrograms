import java.util.HashSet;

public class NumberOfSocksPairs {

    public static int countPairs(int [] array){
        int pairs =0;
        HashSet<Integer> unmatched = new HashSet<>();
        for(int i=0; i<array.length; i++){
            if(!unmatched.add(array[i])){
                unmatched.remove(array[i]);
                pairs++;
            }
        }
        return pairs;
    }

    public static void main (String argsp[]){
        int [] socks = {10, 10, 90, 20, 20, 20, 10, 20, 90};
        int pairs = NumberOfSocksPairs.countPairs(socks);
        System.out.println("Number of pairs "+pairs);
    }
}
