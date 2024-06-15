
import java.util.Arrays;

public class kth {
    public static int kthsmall(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={7, 10, 4, 3, 20, 15};
        int k=3;
        int result= kthsmall(arr, k);
        if(result!= -1){
            System.out.println("the kth smallest element is: " +result);
        }else{
            System.out.println("invliad");
        }
    }
}
