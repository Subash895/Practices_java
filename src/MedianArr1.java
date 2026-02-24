import java.util.Arrays;

public class MedianArr1 {

    public static void main(String[] args) {

        int[] num1 = {1, 2, 3};
        int[] num2 = {2};

        int m = num1.length;
        int n = num2.length;

        int[] merged = new int[m + n];

        for (int i = 0; i < m; i++) {
            merged[i] = num1[i];
        }

        for (int i = 0; i < n; i++) {
            merged[m + i] = num2[i];
        }

        Arrays.sort(merged);

        double median;
        int total = merged.length;

        if (total % 2 == 0) {
            median = (merged[total/2 - 1] + merged[total/2]) / 2.0;
        } else {
            median = merged[total/2];
        }

        System.out.println("Merged Array: " + Arrays.toString(merged));
        System.out.println("Median: " + median);
    }
}