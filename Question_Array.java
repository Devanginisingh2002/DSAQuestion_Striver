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
  // public static int second_largest(int nums[]) {
  //   int largest = nums[0];
  //   int second_largest = Integer.MIN_VALUE;
  //   for(int i=1; i<nums.length; i++){
  //       if(nums[i] > largest){
  //           second_largest = largest;
  //           largest = nums[i];
  //       }
  //       else if(nums[i] < largest && nums[i] > second_largest){
  //           second_largest = nums[i];
  //       }
  //   }
  //   return second_largest;
  // }
  // public static int second_smallest(int nums[]){
  //   int smallest = nums[0];
  //   int second_smallest = Integer.MAX_VALUE;
  //   for(int i=1; i<nums.length; i++){
  //       if(nums[i] < smallest){
  //           second_smallest = smallest;
  //           smallest = nums[i];
  //       }
  //       else if(nums[i] > smallest && nums[i] < second_smallest){
  //           second_smallest = nums[i];
  //       }
  //   }
  //   return second_smallest;
  // }

  // public static void main(String args[]){
  //   int nums[] = {2, 5, 6, 7 ,1};
  //   System.out.println(second_largest(nums));
  //   System.out.println(second_smallest(nums));
  // }

  /*************** SORTED ARRAY **************/
  // public static boolean sortedArray(int nums[]){
  //   for(int i=0; i<nums.length-1; i++){
  //     if(nums[i] > nums[i+1]){
  //       return false;
  //     }
  //   }
  //   return true;
  // }
  // public static void main(String args[]){
  //   int nums[] = {1, 2, 3, 4, 5};
  //   System.out.println(sortedArray(nums));
  // }

  /************REMOVE DUPLICATE FROM SORTED ARRAY ********: HASH SET/

  /******** LEFT ROTATE AN ARRAY BY D PLACE ********/
  // public static void LeftRotate(int nums[]) {
  //   int temp = nums[0];
  //   for (int i = 1; i < nums.length; i++) {
  //     nums[i - 1] = nums[i];
  //   }
  //   nums[nums.length - 1] = temp;
  // }
  // public static void main(String args[]) {
  //   int nums[] = {1, 2, 3, 4, 5};
  //   System.out.println(LeftRotate(nums));
  // }

  /*************GIVEN AN ARRAY OF N INTEGERS, LEFT ROTATE THE ARRAY BY ONE
   * *********/

    public static void solve(int arr[], int n) {
      int temp = arr[0]; 
      for (int i = 0; i < n - 1; i++) {
        arr[i] = arr[i + 1];
      }
      arr[n - 1] = temp; 
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
    }
    public static void main(String args[]) {
      int n = 5;
      int arr[] = {1, 2, 3, 4, 5};
      solve(arr, n);
    }
}

 public static int[] moveZeros(int n, int []a) {
        //temporary array:
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                temp.add(a[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
