import java.util.Arrays;

public class kthlargestElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = { -2, 6, 34, 9 };

        int n = arr.length;
        int k = 1;

        Arrays.sort(arr);

        System.out.println(arr[n - k]);
    }

}
