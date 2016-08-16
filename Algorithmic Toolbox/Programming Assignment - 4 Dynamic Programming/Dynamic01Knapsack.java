import java.util.Scanner;
/* @author Priyank Agrawal
 * 
 * Date 08/15/2016
 * 
 * Time Complexity O(W*totalItems)
 *
 * Take as many gold bars as possible in the knapsack without repetition 
 * 
 */
public class Dynamic01Knapsack {
	static int optimalWeight(int W, int[] w){
		if(W==0)
			return 0;
		int[][] dp = new int[w.length][W+1];
		for(int i=0;i<w.length;++i){
			for(int j=0;j<=W;++j){
				if(j==0) //if knapsack weight is 0
					dp[i][j] = 0;
				else if(w[i]==j) //if knapsack weight is equal to item weight
					dp[i][j] = w[i];
				else if(w[i]<j && i==0) //if knapsack weight is greater than first item in the weight array
					dp[i][j] = w[i];
				else if(w[i]<j && i!=0) //if knapsack weight is greater than rest of the array items
					dp[i][j] = Math.max(w[i]+dp[i-1][j-w[i]],dp[i-1][j]);
				else
					if(w[i]>j && i==0){
						dp[i][j] = 0;
					}
					else{
						dp[i][j] = dp[i-1][j];	//if knapsack weight is less than item weight than rest of the array items
					}
								
			}
		}
		return dp[w.length-1][W];
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int W, n;
		W = scanner.nextInt();
		n = scanner.nextInt();
		int[] w = new int[n];
		for(int i=0;i<n;i++){
			w[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(optimalWeight(W, w));
	}
}

