// Input: 5

// Output:

// *********
//  *******
//   *****
//    ***
//     *

public class Pattern_8 {
    void printTriangle(int n) {
        // code here
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
