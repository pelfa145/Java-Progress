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
       binarySearch(sortedData, 23);
        
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
            //left tas left
            if (target < secondIter) {
                int thirdHalf = secondHalf / 2;
                int thirdIter = arr[thirdHalf];
                System.out.println(thirdIter);
                System.out.println("left tas left");
                //left tas left tas left
                if(target < thirdIter){
                    for(int i = thirdHalf;arr[i]<=target;i++){
                        if(arr[i] == target){
                            System.out.println("Found! at index: "+i);
                            return 0;
                        }
                    }
                //left tas left tas right
                }else if(target > thirdIter){
                    System.out.println("left tas right");
                    for(int i = thirdHalf;arr[i]<=target;i++){
                        if(arr[i] == target){
                            System.out.println("Found! at index: "+i);
                            return 0;
                        }
                    }
                }
            //left tas right
            }else if(target > secondIter){
                System.out.println("left tas right");
            }
        //right half sa list
        } else if (target > firstIter) {
            int secondHalf = firstHalf + (firstHalf / 2) + 1;
            int secondIter = arr[secondHalf];
            System.out.println(secondIter);
            //right tas right
            if (target > secondIter) {
                int thirdHalf = secondHalf + (secondHalf/3);
                int thirdIter = arr[thirdHalf];
                System.out.println(thirdIter);
                System.out.println("right tas right");
                //right tas right tas right
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
                //right tas right tas left
                else if(target > thirdIter){
                    for(int i = thirdHalf;arr[i]<=target;i++){
                        if(arr[i] == target){
                            System.out.println("Found! at index: "+i);
                            return 0;
                        }
                    }
                }
            //right tas left
            } else if(target < secondIter){
                System.out.println("right tas left");
            }
        }
        return -1;
    }
}
