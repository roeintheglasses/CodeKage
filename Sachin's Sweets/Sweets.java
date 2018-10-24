/* 

Sachin likes sweets a lot. So, he goes to a market of sweets. There is a row of sweet stalls.
Every sweet stall has different sweets. To save some time, he decided to buy sweets from contiguous stalls. 
So, he can buy from as many stalls as he wants, but all of those stalls need to be contiguous. 
He also decided to buy only 1 kg of sweets from each of those stalls. 
Cost of 1 kg of sweets for each stall is given. There is a strange rule of billing in that market. 
And that rule is as follows- 
Total cost of all sweets bought is sum of the cost of all sweets multiplied by the cost of sweet he bought at the end.
e.g. if he buys sweets having cost 2, 3, 4 in the same order than total cost of sweets will be 24+34+4*4=36. 
Now he wonders what will be the total cost of all possible ways of buying sweets. Can you help him. 
Because this number could be large, you should take modulo of the final result by 10^9+7.

INPUT SPECIFICATION 
function contains a single argument- A One dimensional Integer array of Size N in which ith element denotes the cost of 1 kg sweets from ith stall. 
First line of input contains an Integer N denoting the size of Array. (1<=N<=10^5) Next N lines of input each containing a single integer from 1 to 9.

OUTPUT SPECIFICATION 
Must return an integer sum of the cost of all possible ways of buying sweets modulo 10^9+7.

roe wuz here
🖤🔥💀

*/




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
