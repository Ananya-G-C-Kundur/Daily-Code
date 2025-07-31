// User function Template for Java
import java.util.Scanner;

class Multiple_Int{
    static int multiplication(int A, int B) {
        // code here
        int multiple = A*B;
        return multiple;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(multiplication(A,B));

        sc.close();
    }
}