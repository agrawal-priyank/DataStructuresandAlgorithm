import java.util.Arrays;
import java.util.Scanner;

public class MinimumDotProduct {
	 
	private static long minDotProduct(long[] arrayA, long[] arrayB) {
	        
	        long result = 0;
	        int size = arrayB.length;
	        
	        if(arrayA.length == 0){
	        	return result;
	        }
	        
	        if(arrayA.length == 1){
	        	result = arrayA[0] * arrayB[0];
	        	return result;
	        }
	        
	        if(arrayA.length > 1){
	        	for (int i = 0; i < arrayA.length; i++) {
		            result += arrayA[i] * arrayB[size-1-i];
		        }
		        return result;	
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int n = scanner.nextInt();
	        
	        long[] arrayA = new long[n];
	        for (int i = 0; i < n; i++) {
	            arrayA[i] = scanner.nextLong();
	        }
			Arrays.sort(arrayA);
						
	        long[] arrayB = new long[n];
	        for (int i = 0; i < n; i++) {
	            arrayB[i] = scanner.nextLong();
	        }
			Arrays.sort(arrayB);
			
			System.out.println(minDotProduct(arrayA, arrayB));
	        scanner.close();
	    }
}
