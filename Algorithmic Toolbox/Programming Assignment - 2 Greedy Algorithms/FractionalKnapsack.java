import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {

	private static double getOptimalValue(int knapsackCapacity, int numberOfItems, double[][] valuePerWeight) {
	        double value = 0;
	        int i = numberOfItems - 1;
	        
	        if(knapsackCapacity == 0){
	        	return value;
	        }
	        else{
	        	while(knapsackCapacity > 0 && i >= 0){
	        		if(valuePerWeight[i][1] > knapsackCapacity){
	        			value += knapsackCapacity * valuePerWeight[i][0];
	        			knapsackCapacity = 0;
	        		}
	        		else{
	        			value += valuePerWeight[i][1] * valuePerWeight[i][0];
	        			knapsackCapacity -= valuePerWeight[i][1];	        			
	        		}
	        		--i;	        			        	
	        	}
	        }
	        
	        return value;
	    }

	public static void main(String args[]) {
		
	        Scanner scan = new Scanner(System.in);
	        
	        int numberOfItems = scan.nextInt();
	        
	        int knapsackCapacity = scan.nextInt();
	        
	        double[] values = new double[numberOfItems];
	        double[] weights = new double[numberOfItems];
	        
	        for(int i = 0; i < numberOfItems; i++) {
	            values[i] = scan.nextInt();
	            weights[i] = scan.nextInt();	            
	        }
	        
	        double[][] valuePerWeight = new double[numberOfItems][2];
	        
	        for(int i = 0; i < numberOfItems; i++){
	        	valuePerWeight[i][0] = values[i]/weights[i];	        	
	        	valuePerWeight[i][1] = weights[i];
	        }
	        
	        if(valuePerWeight.length > 1){
	        	Arrays.sort(valuePerWeight, new java.util.Comparator<double[]>() {
	                public int compare(double[] a, double[] b) {
	                    return Double.compare(a[0], b[0]);
	                }
	            });	        	
	        }
	        	        
	        scan.close();
	        
	        System.out.println(getOptimalValue(knapsackCapacity, numberOfItems, valuePerWeight));
	    }

}
