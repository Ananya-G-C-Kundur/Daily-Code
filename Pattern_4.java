//Input : n=5

//Output:
// 1
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5

public class Pattern_4 {
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }System.out.println();
        }
    }
}
