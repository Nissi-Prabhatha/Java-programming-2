import java.util.Arrays; 
import java.util.Collections;
import java.util.*; 
  
public class SmallQ24 
{    
    public static int kthSmallest(Integer[] arr,int k)  
    { 
        // Sort the given array 
        Arrays.sort(arr); 
  
        // Return k'th element in the sorted array 
        return arr[k-1]; 
    }  
public static void main(String[] args)  
    { 
        Integer arr[] = new Integer[]{12, 3, 5, 7, 19}; 
		System.out.println("enter the value k:");
		Scanner s=new Scanner(System.in);
		int k=s.nextInt(); 
        System.out.print( "K'th smallest element is "+kthSmallest(arr, k) );      
    } 
} 