import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 */

public class NextPermutation {
    public static void nextPermutation(int[] nums){
        // nums = [1,2,3] the next lexi would be [1,3,2]
        int greaterNum= 0;
        String value = "";
        for (int i = 0; i < nums.length; i++)
        {
            value += nums[i]; // Build out the number as a string
        }
        int numsInt = Integer.parseInt(value);
        while (greaterNum<numsInt){
            greaterNum = perm(nums);
        }
        System.out.println(nums);
    }
    public static int perm(int[] nums){
        List<Integer> list = new LinkedList<>();
        for (int num : nums) {
            list.add(num);
        }
        return 1;
    }
}
