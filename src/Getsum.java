import java.util.Arrays;

public class Getsum {
    public int getSum(int n){

        int sum=1;
        for (int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }

    public int getValues(int num[]){
        int sum=1;
        for (int i=0;i<num.length;i++){
            sum*=num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Getsum gsm = new Getsum();
        int no1=4;
        int []a = new int[]{1,2,3,4};
        System.out.println(gsm.getSum(no1));
        System.out.println(Arrays.toString(new int[]{gsm.getValues(a)}));
    }
}
