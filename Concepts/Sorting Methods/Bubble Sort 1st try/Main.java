public class Main {
    public static void main(String[] args) {

        int[] arr = {7, 2, 5, 1, 4};
        
        sort(arr);
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j + 1];
                int temp2 = arr[j];
                if (temp2 > temp){
                    int temp3 = temp2;
                    temp2 = temp;
                    temp = temp3;

                    arr[j]=temp2;


                    System.out.println("This is inside for if loop: "+temp2);
                    System.out.println("This is inside for if loop: "+temp);

                }

            }
            System.out.println("this is outside: "+i);

        }
    }
}
