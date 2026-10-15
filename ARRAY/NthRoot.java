public class NthRoot {

    public static int nthRoot(int n, int m) {

        int low = 1;
        int high = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long result = 1;

            for (int i = 1; i <= n; i++) {
                result = result * mid;

                if (result > m) {
                    break;
                }
            }

            if (result == m) {
                return mid;
            } 
            else if (result < m) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 27;

        System.out.println(nthRoot(n, m));
    }
}