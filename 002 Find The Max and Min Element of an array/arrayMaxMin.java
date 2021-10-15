import java.util.*;

public class arrayMaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Scanning the arry;
        int n;
        System.out.println("Enter the Size of the Array");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt(); 
        }        
        //finding the smallest and the largest
        int min = arr[0], max = arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The Array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

        System.out.println("The Max Element is:"+max);
        System.out.println("The Min Element is:"+min);
    }
}
