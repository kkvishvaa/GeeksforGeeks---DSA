public class FindSum {

    public static int findSum(int A[], int N) {

        int n = A.length;
        int maxNo = Integer.MIN_VALUE;
        int minNo = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            maxNo = Math.max(maxNo, A[i]);
            minNo = Math.min(minNo, A[i]);
            sum = maxNo + minNo;

        }
        return sum;
    }
}
