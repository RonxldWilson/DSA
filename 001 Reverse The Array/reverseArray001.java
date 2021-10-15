import java.util.*;

class reverseArray001{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The Array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");        
        int swap;
        for(int i=0;i<n;i++){
            swap=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=swap;
        }

        System.out.println("The Reverse of the Array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        s.close();
    }
}