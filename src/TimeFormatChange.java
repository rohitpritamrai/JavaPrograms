import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeFormatChange {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try{
            date = inputFormat.parse(s);
            output = outputFormat.format(date);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return output;
    }


    public static void main(String args[]) throws IOException {

        System.out.println("Enter time in 12 hour format - hh:mm:ssAM/PM :");
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        String result = TimeFormatChange.timeConversion(time);
        System.out.println(result);

    }

}