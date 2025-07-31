// User function Template for Java
import java.util.Scanner;

class If_Else {
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            return "lesser";
        }
        else if(n==m){
            return "equal";
        }
        else if(n>m){
            return "greater";
        }
        else{
            return " ";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(compareNM(n,m));

        sc.close();
    }
}

