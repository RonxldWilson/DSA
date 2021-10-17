import java.util.*;

public class rotateArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        rotateArray obj = new rotateArray();        
        int n;
        System.out.println("Enter the Size of the array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.printArray(arr,n);
        //rotating the array
        int swap=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=swap;
        obj.printArray(arr,n);
        sc.close();
    }

    public void printArray(int arr[], int n){
        System.out.println("The Array is:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }   
}
