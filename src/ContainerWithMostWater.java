public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxarea=0, firstPointer=0, secondPointer=height.length-1;
        while (firstPointer<secondPointer){
            if(height[firstPointer]<height[secondPointer]){
                maxarea=Math.max(maxarea, height[firstPointer]*(secondPointer-firstPointer));
                firstPointer++;
            }
            else{
                maxarea=Math.max(maxarea, height[secondPointer]*(secondPointer-firstPointer));
                secondPointer--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cv = new ContainerWithMostWater();
        int[]nums = new int[]{1,8,6,2,5,4,8,3,7};
        int[]arr = new int[]{1,1};
        int[]no = new int[]{4,3,2,1,4};
        System.out.println(cv.maxArea(arr));
        System.out.println(cv.maxArea(nums));
        System.out.println(cv.maxArea(no));
    }

}
