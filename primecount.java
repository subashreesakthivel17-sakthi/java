import java.util.*;
public class Main
{
    public static int prime(int n,int count){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=prime(n,0);
	    if(ans==2){
	        System.out.println("Prime");
	    }else{
		System.out.println("Not prime");
	    }
	}
}
