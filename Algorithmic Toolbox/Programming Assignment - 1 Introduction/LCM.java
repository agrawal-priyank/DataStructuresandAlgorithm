import java.util.*;

public class LCM {
	public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
	if (a>b){
		System.out.println(a*b/gcd(a, b));
	}
	else{
		System.out.println(a*b/gcd(b, a));
	}
  }
  
  private static long gcd(long a, long b) {
	if(b==0){
		return a;
	}
		return gcd(b, a%b);
  }
}
