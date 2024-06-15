// package sortwithoutmethod;

import java.util.Arrays;

public class sort {
    public static void sortedArrays(int arr[]){
        int low=arr[0];
        int mid=arr[0];
        int high= arr.length-1;

        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;
                
                case 2:
                    int temps=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temps;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0 ,2 ,1 ,2, 0};
        sortedArrays(arr);
        System.out.println(Arrays.toString(arr));
    }
}
