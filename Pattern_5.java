//input n=5

//output:
// * * * * *
// * * * * 
// * * * 
// * *  
// * 

public class Pattern_5 {
    void printTriangle(int n) {
        // code here
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");
            }System.out.println();
        }
    }
}
