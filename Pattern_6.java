// input n=5

//output:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2  
// 1 

public class Pattern_6 {
    void printTriangle(int n) {
        // code here
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }System.out.println();
        }
    }
}
