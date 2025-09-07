public class FindFreq {

    int findFrequency(int arr[], int x) {

        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
