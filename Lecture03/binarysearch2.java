package Lecture03;
import java.util.Arrays;
public class binarysearch2 {

    static int bsearch(int[] arr, int target){     //inserting binary search
        int low=0, high=arr.length-1;
        int probableans=arr.length;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                probableans=mid;
                high=mid-1;
            }
        }
        return probableans;
    }
    
    static void display(int[] arr) {
        
        for (int i:arr){
            System.out.print(i+" ");
        
        }
    }

    public static void main(String[] args){
        int[] arr= {2,3,1,6,8,5,9,7,10};
        Arrays.sort(arr);
        System.out.println(bsearch(arr,4));
        display(arr);
    }
}