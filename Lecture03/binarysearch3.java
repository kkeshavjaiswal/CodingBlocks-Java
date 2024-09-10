package Lecture03;
import java.util.Arrays;
public class binarysearch3 {

    static int lowerbound(int[] arr, int target){
        int low=0, high=arr.length-1;
        int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    
    static void display(int[] arr) {
        
        for (int i:arr){
            System.out.print(i+" ");
        
        }
    }

    public static void main(String[] args){
        int[] arr= {1,1,1,2,2,3,3,3,3,4};
        Arrays.sort(arr);
        System.out.println(lowerbound(arr,2));
        display(arr);
    }
}