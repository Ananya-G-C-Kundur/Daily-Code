// Input: ‘N’ = 3

// Output: 

//   *
//  ***
// *****
// *****
//  ***
//   *

public class Pattern_9 {
    public static void nStarDiamond(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
