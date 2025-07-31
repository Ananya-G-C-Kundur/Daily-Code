// User function Template for Java
import java.util.*;

class Switch_Statement {
    static double switchCase(int choice, List<Double> arr) {
       double x = 0.0;
       double y = 0.0;
       
       switch(choice){
           case 1: x=Math.PI*arr.get(0)*arr.get(0);
           break;
           case 2: y=arr.get(0)*arr.get(1);
           break;
       }
       if(choice==1){
           return x;
       }
       else{
           return y;
       }
    }
}
