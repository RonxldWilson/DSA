import java.util.*;
//Approach 1
public class moveAllNegative {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        moveAllNegative obj = new moveAllNegative();
        int n;
        System.out.println("Enter the Size of the array");
        n=sc.nextInt();
        System.out.println("Enter the Elements");
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.printArray(arr,n);
        //moving all negaative elements to one side
        //array sort can be done, but that would violate the time complexity
        //A seperate array can be taken of same size, if you find a positive number
        // fill it to the end of the array, and if the number is negative fill it
        // the start of the array
        int duplicate[] = new int[n];
        int end,start;
        end = n-1;
        start = 0;
        for(int i = 0;i < n; i++){
            if(arr[i]>=0){
                duplicate[end]=arr[i];
                end--;
            }
            else{
                duplicate[start]=arr[i];
                start++;
            }
        }
        obj.printArray(duplicate, n);
        sc.close();
    }
    public void printArray(int arr[], int n){
        System.out.println("The Array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
