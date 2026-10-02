import java.util.Arrays;

public class occurance {

    public static int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        // Find first occurrence
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 4, 4, 5, 7};
        int target = 4;

        int[] result = searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
