package Lecture03;
import java.util.Arrays;
public class arrays3 {
    
    static void display(int[] arr) {
        
        for (int i:arr){
            System.out.print(i+" ");
        
        }
    }

    public static void main(String[] args){
        int[] arr= {2,3,1,6,8,4,5,9,7};
        Arrays.sort(arr);
        display(arr);
    }
}