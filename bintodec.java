import java.util.*;
public class Main
{
        public static int power(int b,int e){
        int x=1;
        for(int i=1;i<=e;i++){
            x=x*b;
        }
        return x;
        }
    public static int digit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int armstrong(int n){
        int e=digit(n);
        int sum=0;
        while(n>0){
            int b=n%10;
            int ans=power(b,e);
            sum=sum+ans;
            n=n/10;
        }
        return sum;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int val=armstrong(n);
	if(n==val){
	   System.out.println("armstrong");
	}
	else{
	    System.out.println("not armstrong");
	}
	}
}
