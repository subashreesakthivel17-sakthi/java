import java.util.*;
public class Main
{
    public static int even(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            if(r%2==0){
            sum=sum+r;
        }
        n=n/10;
        }
        return sum;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ans=even(n);
	System.out.println(ans);
	}
}
