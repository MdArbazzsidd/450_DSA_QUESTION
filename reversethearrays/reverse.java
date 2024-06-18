package reversethearrays;
import java.util.Scanner;

public class reverse{

    public static void reverseArry(int arr[], int start, int end){
        int temp;
        while (start<end) {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void printArry(int arr[], int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   public static void main(String []args){
    int arr[]={4,3,2,1,5,6,7,8};
    printArry(arr, arr.length);

    reverseArry(arr,0,arr.length-1);

    System.out.println("Reverse arrays are:");
    printArry(arr, 8);
    
   }
}
