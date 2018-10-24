import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
    Scanner s = new Scanner(System.in);
    int length = s.nextInt();
    int sweet[]= new int[length];
    for(int a = 0;a<length;a++)
    {
        sweet[a]=s.nextInt();
    }
    int ans = (CandidateCode.give(sweet))%10000000007;
    s.close();
    System.out.println(ans);
   }
   public static int give (int a[])
   {    int ans = 0;
       for(int i = 0; i<a.length;i++)
       {
           int smalla = 0;
           for(int j =  i+1; j<=a.length;j++)
           {
               
               int arr[] = Arrays.copyOfRange(a,i,j);
                smalla = sum(arr);
                ans = ans+smalla;
           }
         
       }
       return ans;
   }
   
   public static int sum (int a[])
   {
       int i = a[a.length-1];
       int ans = 0;
       for(int j = 0;j<a.length;j++)
       {
           ans = ans+ a[j]*i;
       }
       return ans;
   }
}