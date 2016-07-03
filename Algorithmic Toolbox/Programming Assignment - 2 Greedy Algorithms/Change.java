import java.util.Scanner;

public class Change {
    
	private static int getChange(int n) {
		int ans, rem;
		
		if(n>=10){
			ans=n/10;
			rem=n%10;
			if(rem>=5){
				ans+=rem/5;
				rem=rem%5;
				if(rem>0){
					ans+=rem/1;
				}
			}
			else{
				ans+=rem/1;
			}
		}
		
		else if(n<10 && n>=5){
			ans=n/5;
			rem=n%5;
			if(rem>0){
				ans+=rem/1;
			}			
		}
		
		else if(n>0 && n<5){
			ans=n/1;
		}
		
		else{
			ans=0;
		}
		
		return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));
    }
}

