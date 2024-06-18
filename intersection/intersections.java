// package intersection;

import java.util.ArrayList;

public class intersections {
    
    public int [] intersectionarr( int [] num1, int [] num2){
        ArrayList<Integer> addedInArr = new ArrayList<>();
        for(int i=0; i<num1.length; i++){
            for(int j=0; j<num2.length; j++){
                if(num1[i]==num2[j]){
                    addedInArr.add(num2[j]);
                    num2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int [] res= new int [addedInArr.size()];
        int k=0;
        for(int i : addedInArr){
            res[k]=i;
            k++;
        }
        return res;
        
    }


    public static void main(String [] args){
         int[] num1 = {1, 2, 2, 3, 4};
        int[] num2 = {2, 2, 3, 5};

        // Create an instance of the class and call the intersectionarr method
        intersections intersect = new intersections();
        int[] result = intersect.intersectionarr(num1, num2);

        // Print the result
        System.out.println("Intersection of the two arrays:");
        for (int i : result) {
            System.out.print(i + " ");

    }

    }

}