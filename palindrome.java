import java.util.*;
public class Main
{
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static boolean ispali(int n){
        int rev=reverse(n);
        return n==rev;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean ans=ispali(n);
	    if(ans){
	        System.out.println("Palindrome");
	    }
	    else{
		System.out.println("not palindrome");
	}
	}
}
