import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramid {

    public static void pyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("# ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) throws IOException {
        System.out.println("Please enter the size in number of which stairs to be created :");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        pyramid(n);
        bufferedReader.close();
    }
}
