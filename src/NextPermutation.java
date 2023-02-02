import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 */

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        // nums = [1,2,3] the next lexi would be [1,3,2]
        // find the first decreasing value from right to left
        // swap this value with the next value that is just larger
        // reverse all values that are after the first decreasing
        //we reverse as all values after are smaller than the next ie 2,7,5 , 5 is smaller than 7 but 7 is not smaller than 2, then we reverse for 257
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) { // Determines if there is a greater perm
            i--; // if negative them no next perm, otherwise there is a next perm
                 // i is also the first decreasing value
        }
        if (i>=0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        return nums;
    }
    public static int[] swap(int[] nums, int origin, int newDest){
        int temp = nums[origin];
        nums[origin] = nums[newDest];
        nums[newDest] = temp;
        return nums;
    }
}
