public class SearchRotatedArray {

    public int search(int[] nums, int target) {

        int i = 0;
        int index = 1;
        while (i < nums.length) {
            if (nums[i] == target) {
                index *= i;
                return index;
            }
            i++;

        }  return -1;
    }

    public static void main(String[] args) {
        SearchRotatedArray srt = new SearchRotatedArray();
        int []nums = new int[]{4,5,6,7,0,1,2};
        int[]nos= new int[]{4,5,6,7,0,1,2};
        int tar=3;
        int target=0;
        System.out.println(srt.search(nums,target));
        System.out.println(srt.search(nos,tar));
    }
}
