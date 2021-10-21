import java.util.*;

public class SubsetOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Make sure array 1 is bigger than the array 2");
        System.out.println("Enter the array 1 size");
        n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the Elements of array 1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }   
        
        System.out.println("Enter the array 2 size");
        n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the Elements of array 2");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }   

        // printArray(arr1,n1);
        // printArray(arr2,n2);
        if(n1>n2){
            int checkerArray[]=new int[n2];
            for(int i=0;i<n2;i++){
                checkerArray[i]=0;
            }
            for(int i=0;i<n2;i++){
                for(int j=0;j<n1;j++){
                    if(arr2[i]==arr1[j]){
                        checkerArray[i]=1;
                    }
                }
            }
            
            //Total of the Array
            int total =0;
            for(int i=0;i<n2;i++){
                total = checkerArray[i]+total;
            }
            // System.out.println("Checker Array Sum"+total);
            if(total==n2){
                System.out.println("The Array is a subset of the original array");
            }
            else{
                System.out.println("The Array is not a subset of the original array");
            }


        }
        else{
            System.out.println("The array size is incompatible");
        }
        sc.close();
    }
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

