import java.io.*;

class FactorialJava {
	public static void main (String[] args) {
		
		int ans=1, n=6;
		for (int i=1; i<=n; i++) {
		    ans=ans*i;
		}
		System.out.println(ans);
		
	}
}