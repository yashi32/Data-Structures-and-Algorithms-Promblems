
import java.io.*;
import java.util.*;

//User function Template for Java
class Solution{
     static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        
        int i=0;
        int j=0;
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        
        while(j<N)
        {   
            sum=sum+Arr.get(j);
            
            if(j-i+1 < K)
            {
                j++;
            }
            
            else if(j-i+1 == K)
            {
                max_sum=Math.max(sum,max_sum);
                sum=sum-Arr.get(i);
                i++;
                j++;
            }
            
        }
        return max_sum;
    }
}
