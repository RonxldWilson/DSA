import java.lang.reflect.Array;
import java.util.*;
//Find Union and Intersection of two sorted array
public class sortedArraysUnionAndIntersection{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sortedArraysUnionAndIntersection obj = new sortedArraysUnionAndIntersection();

        int n1,n2;
        System.out.println("Enter the Number of elements of array 1");
        n1 = sc.nextInt();
        System.out.println("Enter the Number of elements of array 1");
        n2 = sc.nextInt();
        
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        System.out.println("Enter the Elements for array 1");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Elements for array 2");
        for(int i=0; i<n; i++){
            arr2[i]=sc.nextInt();
        }
        //Union
        // Just the count of the Union array is required
        // To do that just 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //first find the number of repitions in array 1
        //then take one element of array 2 and compare it with all elements of 
        // array 1, if there is a match then don't count, if there is no match then increase the count by one 
        int unionCount=0;
        int intersectionCount=0;
        //check for repitions in array 1
        int compare;
        for(int i = 0; i<n;i++){
            compare=arr[i];
            if(arr[i+1]==compare){
                    
            }
        }
        //Intersection
    }
    
    public printArray(int arr[], int n){
        System.out.println("The Array is :");
        for(int i = 0;i< n;i++){
            System.out.println(arr[i]);
        }
    }
}