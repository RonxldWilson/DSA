import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Array Size");
        n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int given;
        System.out.println("Enter the given value");
        given =sc.nextInt();
        //Solution
        Arrays.sort(arr);
        

        for(int i = 0;i<n;i++){
        if(arr[i]>given){
            break;
        }    
        else{
            
        }
        }

    }
    public static void printArray(int arr[], int n){
        System.out.println("The Array is:");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
