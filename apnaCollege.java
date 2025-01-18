import java.util.*;
public class apnaCollege{
    // Q1: Distinct Element: [1, 2, 3, 4]: return false and [1, 2, 3 ,1]: return true
    // public static boolean arrayQue(int nums[]){
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String args[]){
    //     int nums[] = {1, 2, 3, 1};
    //     System.out.println(arrayQue(nums));
    // }

    //Q2
    public static int questionTwo(int nums[], int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 0;
        System.out.println(questionTwo(nums, key));
    }
}