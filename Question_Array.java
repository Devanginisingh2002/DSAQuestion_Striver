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
  //   public static int largest(int arr[]) {
  //     int largest = arr[0];
  //     for (int i = 0; i < arr.length; i++) {
  //       if (arr[i] > largest) {
  //         largest = arr[i];
  //       }
  //     }
  //     return largest;
  //   }
  //   public static int secondLargest(int arr[]) {
  //     int largest = largest(arr); // call largest method
  //     int second_largest = Integer.MIN_VALUE;
  //     for (int i = 0; i < arr.length; i++) {
  //       if (arr[i] > second_largest && arr[i] != largest) {
  //         second_largest = arr[i];
  //       }
  //     }
  //     return second_largest;
  //   }

  //   public static void main(String args[]) {
  //     int arr[] = {1, 2, 4, 7, 7, 5};
  //     System.out.println(secondLargest(arr));
  //   }
  // optimize approach: T.C: O(n)
  public static int second_largest(int nums[]) {
    int largest = nums[0];
    int second_largest = Integer.MIN_VALUE;
    for(int i=1; i<nums.length; i++){
        if(nums[i] > largest){
            second_largest = largest;
            largest = nums[i];
        }
        else if(nums[i] < largest && nums[i] > second_largest){
            second_largest = nums[i];
        }
    }
    return second_largest;
  }
  public static int second_smallest(int nums[]){
    int smallest = nums[0];
    int second_smallest = Integer.MAX_VALUE;
    for(int i=1; i<nums.length; i++){
        if(nums[i] < smallest){
            second_smallest = smallest;
            smallest = nums[i];
        }
        else if(nums[i] > smallest && nums[i] < second_smallest){
            second_smallest = nums[i];
        }
    }
    return second_smallest;
  }

  public static void main(String args[]){
    int nums[] = {2, 5, 6, 7 ,1};
    System.out.println(second_largest(nums));
    System.out.println(second_smallest(nums));
  }
}