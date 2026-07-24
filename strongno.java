import java.util.*;
public class Main
{
    public static int factor(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int strong(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            int ans=factor(r);
            sum=sum+ans;
            n=n/10;
        }
        return sum;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=strong(n);
	    if(n==ans){
	        System.out.println("Strong number");
	    }
	    else{
	        System.out.println("not strong number");
	    }
     	}
}