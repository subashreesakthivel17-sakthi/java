import java.util.*;
public class Main
{
    public static int bintodec(int n){
        int ans=0;
        int r=0;
        int x=1;
        while(n>0){
            r=n%10;
            ans=ans+(r*x);
            x=x*2;
            n=n/10;
        }
        return ans;
    }
    public static int dectooct(int n){
        int ans=0;
        int rem=0;
        int x=1;
        while(n>0){
            rem=n%8;
            ans=ans+(rem*x);
            x=x*10;
            n=n/8;
        }
        return ans;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=bintodec(n);
	    System.out.println("Decimal ="+a);
	    int b=dectooct(a);
	    System.out.println(b);
	    
	}
}
