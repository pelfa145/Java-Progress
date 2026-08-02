import java.util.Arrays;
public class App {
    public static void main(String[] args) {

        String[] fruits = { "apple", "orange", "banana" };

        try {
            System.out.println(fruits[2]);
        } catch (Exception e) {
            System.out.println("Out of bounds");
        }
        int[] sortedData = {
                2, 5, 8, 12, 16, 23, 38, 45, 56, 67, 78, 89, 90, 94, 99, 105, 112, 128, 140, 150
        };
       binarySearch(sortedData, 2);
        
    }

    public static int binarySearch(int[] arr, int target) {

        int lengthOfArr = arr.length;
        int firstHalf = (lengthOfArr / 2) - 1;
        int firstIter = arr[firstHalf];
        System.out.println(firstIter);

        //left half sa list
        if (target < firstIter) {
            int secondHalf = firstHalf / 2;
            int secondIter = arr[secondHalf];
            System.out.println(secondIter);
            if (target < secondIter) {
                int thirdHalf = secondHalf / 2;
                int thirdIter = arr[thirdHalf];
                System.out.println(thirdIter);
                System.out.println("branch 1");
                if(target < thirdIter){
                    for(int i = thirdHalf;arr[i]<=target;i++){
                        if(arr[i] == target){
                            System.out.println("Found! at index: "+i);
                            return 0;
                        }else{
                            System.out.println("not found");
                            return 0;
                        }
                    }
                }
            }
        //right half sa list
        } else if (target > firstIter) {
            int secondHalf = firstHalf + (firstHalf / 2) + 1;
            int secondIter = arr[secondHalf];
            System.out.println(secondIter);
            if (target > secondIter) {
                int thirdHalf = secondHalf + (secondHalf/3);
                int thirdIter = arr[thirdHalf];
                System.out.println(thirdIter);
                System.out.println("branch 2");
                if(target > thirdIter){
                    for(int i = thirdHalf;arr[i]<=target;i++){
                        if(arr[i] == target){
                            System.out.println("Found! at index: "+i);
                            return 0;
                        }else{
                            System.out.println("not found");
                            return 0;
                        }
                    }

                }
            } else if(target < secondIter){
                System.out.println("Hello branch 3");
            }
        }
        return -1;
    }
}
