import java.util.*;
public class Main{
    public static void spiral(int n,int a[][]){
        int top=0;
        int left=0;
        int right=n-1;
        int bot=n-1;
        while(left<=right&&top<=bot){
            for(int j=left;j<=right;j++){
                System.out.print(a[top][j]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                System.out.print(a[i][right]);
            }
            right--;
            for(int j=right;j>=left;j--){
                System.out.print(a[bot][j]);
            }
            bot--;
            for(int i=bot;i>=top;i--){
                System.out.print(a[i][left]);
            }
            left++;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        spiral(n,a);
    }
}