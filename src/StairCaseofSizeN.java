import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairCaseofSizeN {

    public static void staircase(int n){
        for(int j=1; j<=n; j++){
            for(int i=n; i>j; i--){
                System.out.print(" ");
            }
            System.out.print("#");
            for(int k=1; k<j; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Please enter the size in number of which stairs to be created :");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        staircase(n);
        bufferedReader.close();
    }
}
