import java.util.ArrayList;
import java.util.List;

public class Majority_ele {

    static List<Integer> majority(int[] arr) {

        List<Integer> ele = new ArrayList<>();

        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        // Step 1: Find two possible candidates
        for (int i = 0; i < arr.length; i++) {

            if (count1 == 0 && arr[i] != ele2) {
                ele1 = arr[i];
                count1++;
            }

            else if (count2 == 0 && arr[i] != ele1) {
                ele2 = arr[i];
                count2++;
            }

            else if (ele1 == arr[i]) {
                count1++;
            }

            else if (ele2 == arr[i]) {
                count2++;
            }

            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ele1)
                count1++;

            if (arr[i] == ele2)
                count2++;
        }

        // More than n/3
        int mini = arr.length / 3 + 1;

        if (count1 >= mini)
            ele.add(ele1);

        if (count2 >= mini)
            ele.add(ele2);

        return ele;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 2, 3, 3, 3};

        System.out.println(majority(arr));
    }
}