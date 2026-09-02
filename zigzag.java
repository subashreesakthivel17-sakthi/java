import java.util.*;
public class Main
{
    public static void snake(int n){
        int value=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(value+" ");
                    value++;
                }
            }
            else{
                int v=value+n-1;
                for(int j=0;j<n;j++){
                    System.out.print(v+" ");
                    v--;
                }
                value=value+n;
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	snake(n);
	}
}
