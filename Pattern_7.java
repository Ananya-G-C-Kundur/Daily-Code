// Input: 5

// Output:
//     *
//    ***  
//   *****
//  *******
// *********

public class Pattern_7{
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}