import java.util.*;
import java.io.*;

public class MajorityElementVoting {
    
	private static int getMajorityElement(int[] a) {
		int result = 0;
		int count = 0;
		
		for(int i=0;i<a.length;i++){
			if(count == 0){
				result = a[i];
				count = 1;
			}
			else if(result == a[i]){
				count++;
			}
			else{
				count--;
			}
		}
		
		count = 0;
		
		for(int i=0; i<a.length;i++){
			if(a[i] == result){
				count++;				
			}
		}
		
		if(count > a.length/2){
			return 1;
		}
		else{
			return -1;
		}			
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();            
        }

        if (getMajorityElement(a) == -1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    
}

