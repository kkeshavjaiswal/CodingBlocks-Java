package Lecture03;
import java.util.Arrays;
public class binarysearch {

    static boolean bsearch(int[] arr, int target){
        int low=0, high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    
    static void display(int[] arr) {
        
        for (int i:arr){
            System.out.print(i+" ");
        
        }
    }

    public static void main(String[] args){
        int[] arr= {2,3,1,6,8,5,9,7,10};
        Arrays.sort(arr);
        System.out.println(bsearch(arr,9));
        display(arr);
    }
}