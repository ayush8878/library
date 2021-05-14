// INSERTION SORT

public class InsertionSort
{
 public static void main(String args[])
   {
    int []arr = new int[]{5,2,7,8,1,11};
    System.out.println("Insertion sort for array: " + java.util.Arrays.toString(arr) + "is " + java.util.Arrays.toString(insertionSort(arr)));
    }   
 public static int[] insertionSort(int[] arr)
   {
    int i = 0;
    int key = Integer.MIN_VALUE;
    for(int j=1 ;  j < arr.length ; j++)
     {
      key = arr[j];
      i = j-1;
      while(i >= 0 && arr[i] > key )
         {
          arr[i+1] = arr[i];
          i = i - 1;
          arr[i+1] = key;
          }
      }
    return arr;
    }
 }


