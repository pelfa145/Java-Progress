import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {9,6,3,5,7,2,8,1};

        bubblesort(arr);
    }
    static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {


                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;

                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
