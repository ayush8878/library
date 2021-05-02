public class MaximumSumSubArrayOfSizeK
{
/*
*This method will find maximum sum of subarray of size k using sliding window protocol
*/
 public static int findMaximumSumSubArrayOfSizeK(int []arr,int k)
                 {
                 int windowStart =0;
                 int maxSum = 0;
                 for( int windowEnd = 0;windowEnd<arr.length;windowEnd++)
                      {
                        // add windowEnd value to windowSum
                       windowSum += arr[windowEnd];
                        if(windowEnd>=k-1)
                           {
                            if(windowSum > maxSum )
                              {
                              maxSum = windowSum ;
                              }   
                            windowSum -= arr[windowStart]; 
                            windowStart++;
                            }
                      }
                      return maxSum;
                 }
public static void main(String args[])
{
int []arr = new int[]{1,3,2,6,-1,4,1,8,2};
int k =5;
int maxSum = findMaximumSumSubArrayOfSizeK(arr,k);
System.out.print("Maximum sum of subarray of size:" +k+" is "+maxSum);
}
}
