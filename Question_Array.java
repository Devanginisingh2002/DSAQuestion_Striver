import java.util.*;
import java.util.Arrays;

public class Question_Array {
  /**************** FIND LARGEST ELEMENT IN AN ARRAY **********/
  // Recursive way: O(n)
  //     public static int largestArray(int nums[]){
  //         int largest = nums[0];
  //         for(int i=0; i<nums.length; i++){
  //             if(nums[i] > largest){
  //                 largest = nums[i];
  //             }
  //         }
  //         return largest;
  //     }
  // public static void main(String args[]){
  //     int nums[] = {2, 5, 1, 3, 0};
  //     System.out.println(largestArray(nums));
  // }

  // Brute Force: O(nlogn)
  //   public static int sortArrayLargest(int nums[]) {
  //     Arrays.sort(nums);
  //     return nums[nums.length - 1];
  //   }

  //   public static void main(String args[]) {
  //     int nums[] = {2, 5, 1, 3, 0};
  //     System.out.println(sortArrayLargest(nums));
  //   }

  /************ FIND SECOND LARGEST ELEMENT IN AN ARRAY **********/
  // Brute force approach: O(NlogN + N)

  // Better Approach: O(N+N) -> O(2N)
  public static int largest(int arr[]) {
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }
  public static int secondLargest(int arr[]) {
    int largest = largest(arr); // call largest method
    int second_largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > second_largest && arr[i] != largest) {
        second_largest = arr[i];
      }
    }
    return second_largest;
  }

  public static void main(String args[]) {
    int arr[] = {1, 2, 4, 7, 7, 5};
    System.out.println(secondLargest(arr));
  }
}