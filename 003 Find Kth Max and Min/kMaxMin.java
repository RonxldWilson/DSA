import java.util.*;
//Array sort approach
public class kMaxMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        System.out.println("Enter the Elements of the Array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("The Sorted Array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        int k;
        System.out.println("Enter the K to find the largest and smallest:");
        k =sc.nextInt();
        System.out.println("The "+k+"th Largest Element is:"+arr[n-2-k]);
        System.out.println("The "+k+"th Smallest Element is:"+arr[n-k]);
        
    }
}
