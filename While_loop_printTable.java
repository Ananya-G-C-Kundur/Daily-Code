import java.util.Scanner;

public class While_loop_printTable {
    public void calculateMultiples(int n) {
        // code here
        int i=10;
        int res;
        while(i>=1){
            res = n * i;
            System.out.print(res +" ");
            i--;
        }System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        While_loop_printTable ob = new While_loop_printTable();
         
        ob.calculateMultiples(n);

        sc.close();
        
    }
}
