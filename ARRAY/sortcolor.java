
import java.util.Arrays;

public class sortcolor {

    public static void sortColors(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (mid <= right) {

            if (nums[mid] == 0) {

                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;

                left++;
                mid++;

            } 
            else if (nums[mid] == 1) {

                mid++;

            } 
            else {

                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;

                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
