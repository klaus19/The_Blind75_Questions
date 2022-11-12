public class MaximumProductSubArray {

    public int maxProduct(int[] nums) {

        int prod = 1;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }
        }
        prod = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MaximumProductSubArray mps = new MaximumProductSubArray();
       // int[]nums = new int[]{2,3,-2,4};
       // int[]ar = new int[]{-2,0,-1};
        int[]no = new int[]{-3,-1,-1};
        int[]arrs = new int[]{0,2};
       // System.out.println(mps.maxProduct(nums));
       // System.out.println(mps.maxProduct(ar));
        System.out.println(mps.maxProduct(no));
        System.out.println(mps.maxProduct(arrs));
    }

}
