import java.util.Arrays;

public class MaximumSubArray {

    public int maxSubArray(int[]arr) {

        int max_sum=arr[0] ,n=arr.length;

        for (int i=1;i<n;i++){

            if (arr[i-1]>0) arr[i]=arr[i-1]+arr[i];
            if (max_sum<arr[i]) max_sum=arr[i];
        }
        return max_sum;
    }

    public static void main(String[] args) {
        MaximumSubArray ms = new MaximumSubArray();
        int[]arr = new int[]{2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(arr));
    }

}
