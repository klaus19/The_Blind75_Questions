import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[]arr = new int[]{2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(ts.twoSum(arr,target)));
    }
}
