import java.util.*;
public class Main
{
    public static boolean prime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int []arr=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<size;i++){
	        if(prime(arr[i])){
	       System.out.print(arr[i]+" ");
	    }
	    }
	}
}
