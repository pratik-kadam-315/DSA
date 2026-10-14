
import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Square root of a negative number is not supported.");
        } else {
            int low = 1;
            int high = x / 2;
            int ans = 0;

            if (x < 2) {
                ans = x;
            } else {
                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (mid <= x / mid) {
                        ans = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

            System.out.println("Square root: " + ans);
        }

        sc.close();
    }
}
