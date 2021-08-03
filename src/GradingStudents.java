import java.util.ArrayList;
import java.util.List;

/******* Program to round off grading student's grade as per below conditions
 * 1. Any grade less than 40 is failing
 * 2. if the difference between the grade and the next multiple of 5 is less than 3, round grade upto the next multiple of 5
 * 3. if the value of grade is less than 38, no rounding occurs as result will still be a failing grade *****/

/******        Examples
 * grade = 84, round to  85 (85 - 84 is less than 3)
 * grade = 29,  do not round (result is less than 40)
 * grade = 57 do not round (60 - 57 is 3 or higher)       ******/


public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int temp = 0;
        List<Integer> roundoff = new ArrayList<>();
        for(Integer item : grades){
            if(item<38 || ((item%5) <3)){
                roundoff.add(item);
            }else if((item%5) >=3){
                temp = item % 5;
                if(temp == 3){
                    roundoff.add(item+2);
                }else if(temp ==4){
                    roundoff.add(item+1);
                }
            }
        }
        return roundoff;
    }

        public static void main(String args[]){
            List<Integer> grades = new ArrayList<>();
            grades.add(73);
            grades.add(67);
            grades.add(38);
            grades.add(33);

            System.out.println(gradingStudents(grades));
        }
}
