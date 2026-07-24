import java.util.*;
public class Main
{
    public static int factor(int n,int sum){
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=factor(n,0);
	    if(n==sum){
	        System.out.println("Perfect");
	    }
	    else{
	        System.out.println("Not Perfect");
	    }
	}
}