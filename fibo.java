import java.util.*;
public class Main{
public static void fibo(int n){
    int f=0;
    int s=1;
    for(int i=1;i<=n;i++){
        System.out.printf(s+" ");
        int x=f+s;
        f=s;
        s=x;
    }
}
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibo(n);
        
    }
}