import java.util.*;

public class minimumJumps{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        minimumJumps obj = new minimumJumps();

        int n;
        System.out.println("Enter the Size of the Array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elemenets");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        //print the array
        obj.printArray(arr, n);
        //find minimum jumps
        obj.minJumps(arr,n);
        sc.close();
    }
    public void printArray(int arr[], int n){
        System.out.println("The Array is:");
        for(int i=0;i< n;i++){
            System.out.println(arr[i]);
        }
    }
    public void minJumps(int arr[],int n){
        int i=0,temp;
        int jumps=0;
        do{
            temp = i+arr[i];
            i = temp;
            jumps++;
        }while(i<=n);
        System.out.println("The Number of Jumps required is:"+jumps);
    }
}
