import java.util.*;
//Given an array which consists of only 0, 1 and 2. 
// Sort the array without using any sorting algo
public class arrayZeroOneTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Size of the array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elemenets");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //rearranging array
        //we will rearrange it by counting the number of 0s,1s,and 2s in the array
        int zero,one,two;
        zero=0;
        one=0;
        two=0;
        for(int i = 0; i< n;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }   
        //printing sorted array
        for(int i=0;i<zero;i++){
            System.out.print("0");
        }
        for(int i=0;i<one;i++){
            System.out.print("1");
        }
        for(int i=0;i<two;i++){
            System.out.print("2");
        }
        sc.close();
    }
}