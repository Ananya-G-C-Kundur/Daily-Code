import java.util.Scanner;

public class SumOfN {

    public static int Sum(int n){
        int i=1;
        int sum=0;
        while(n>i){
            sum=sum+i;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));

        sc.close();
    }
}
