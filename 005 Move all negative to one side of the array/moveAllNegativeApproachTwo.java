import java.util.*;

public class moveAllNegativeApproachTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        moveAllNegativeApproachTwo obj = new moveAllNegativeApproachTwo();
        int n;
        System.out.println("Enter the Array Size");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array ELements");
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.printArray(arr, n);
        int temp;
        for(int i=0,j=0;i<n;i++){
           if(arr[i]<0){
               if(i != j){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
               }
               j++;
           } 
        }
        obj.printArray(arr, n);
        sc.close();
    }
    public void printArray(int arr[],int n){
        System.out.println("The Array is:");
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
}