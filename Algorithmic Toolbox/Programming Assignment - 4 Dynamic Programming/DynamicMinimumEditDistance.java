import java.util.Scanner;

/* @author Priyank Agrawal
 * 
 * Date 05/15/2016
 * 
 * Time complexity O(m*n)
 * 
 * Space complexity O(m*n)
 * 
 * Given two strings find minimum edits to convert one string into another using insertions, updates & deletions
*/
public class DynamicMinimumEditDistance {
	
	public static int min(int x, int y, int z){
		int l = Math.min(x, y);
		return Math.min(l, z);
	}
	//dynamic programming method which uses bottom up approach
	public static int dynamicEditDistance(String s1, String s2, int m, int n) {
	    	int[][] dp = new int[m+1][n+1];
	    	for(int i=0;i<=m;i++){
	    		for(int j=0;j<=n;j++){
	    			if(i==0)
	    				dp[i][j] = j;
	    			else if(j==0)
	    				dp[i][j] = i;
	    			else if(s1.charAt(i-1)==s2.charAt(j-1))
	    				dp[i][j] = dp[i-1][j-1];
	    			else
	    				dp[i][j] = 1 +min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]);
	    			}
	    		}	    	
	    	return dp[m][n];
	  }
	  
	public static void main(String args[]) {
	    Scanner scan = new Scanner(System.in);
	    String s1 = scan.next();
	    String s2 = scan.next();
	    scan.close();
	    System.out.println(dynamicEditDistance(s1, s2, s1.length(), s2.length()));
	  }

}



