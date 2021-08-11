public class RearrangeArray {

    public static void main(String [] args){
        int [] arr = {0,1,0,0,9,2,0,12,0,1,0,3};

        int temp;
        int j=0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i]==0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int ele : arr) {
            System.out.print(+ele+" ");
        }
    }
}
