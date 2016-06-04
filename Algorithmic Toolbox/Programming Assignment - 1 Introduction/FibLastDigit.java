import java.util.Scanner;

public class FibLastDigit{
	public static void main(String args[]){
		Scanner tropicana = new Scanner(System.in);
		int n = tropicana.nextInt();
		System.out.println(calculateFibonacci(n));
	}
	public static int calculateFibonacci(int n){
		if(n<=1){
			return n;
		}
		else{
			int[] fibonacciArray = new int[n+1];
			fibonacciArray[0]=0;	
			fibonacciArray[1]=1;
			for(int i=2;i<=n;i++){
			fibonacciArray[i]=(fibonacciArray[i-1]+fibonacciArray[i-2])%10;
			}			
			return fibonacciArray[n];
		}
	}
}
