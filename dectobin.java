import java.util.*;
public class Main
{
    public static int dectobin(int n){
        int ans=0;
        int rem=0;
        int x=1;
        while(n>0){
            rem=n%2;
            ans=ans+(rem*x);
            x=x*10;
            n=n/2;
        }
        return ans;
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=dectobin(n);
		System.out.println(a);
	}
}
