package DynamicProgramming;

public class ClimbingStairs {

    public int climbStairs(int n) {

        if(n == 0 || n == 1 || n == 2){return n;}
        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        for(int i = 2; i < n; i++){
            mem[i] = mem[i-1] + mem[i-2];
        }
        return mem[n-1];

    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        int n=3;
        System.out.println(cs.climbStairs(n));
    }



}
