import java.util.Scanner;
public class Fibonacci_series {

	public static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(fib(n));
		sc.close();
	}

}
