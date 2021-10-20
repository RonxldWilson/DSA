import java.util.*;

public class DuplicateArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DuplicateArray obj = new DuplicateArray();
    
        int n;
        System.out.println("Enter the Array size");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //printing of the array
        obj.printArray(arr,n);
        //Checking for duplicates in the array
        int checker;
        for(int i = 0; i < n; i++){
            checker = arr[i];
            for(int j =i+1;j<n;j++){
                if(arr[j]==checker){
                    System.out.println("The duplicate Element is :"+arr[j]);
                }
            }
        }
        sc.close();
}
    public void printArray(int arr[], int n){
        System.out.println("The Array is:");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
