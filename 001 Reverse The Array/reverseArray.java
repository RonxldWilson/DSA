import java.util.*;

class reverseArray{
    public static void main(String args []){
        int n;
        Scanner sc = new Scanner(System.in);
        //Input of the numbe rof elements of the array
        System.out.println("Enter the Number of Elements:");
        n= sc.nextInt();
        int a[] = new int[n];
        //Input of the Elements of Array
        System.out.println("Enter all the Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //printing of the array
        System.out.println("The Array is:");
        for(int i=0; i<n;i++){
            System.out.print(a[i]);
        }
        //reversing of the array
        int rev[] = new int[n];
        for(int i =0; i<n;i++){
            rev[i]=a[n-1-i];
        }
        //printing of the array
        System.out.println("The Array is:");
        for(int i=0; i<n;i++){
            System.out.print(rev[i]);
        }
        sc.close();

    }
}