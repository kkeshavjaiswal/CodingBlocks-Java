package Lecture06;

public class leetcode1552 {
    static int speed(int piles[], int h){
        int low=1;
        int high=1000000000;
        int ans=-1;
        while(low<=high){
            int mid= high-(high-low/2);
            if(check(mid, piles, h )){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static boolean check(int distance, int[] arr, int balls){
        int count=1;
        int lastpos= arr[0];
        for(int i=0; i<arr.length && count<balls;i++){
            if(arr[i]-lastpos>=distance){
                lastpos= arr[i];
                count++;
            }
        }
        return count==balls;
    }
    public static void main (String[] args){
        int h=8;
        int piles[]={3,6,7,11};
        int a=speed(piles, h);
        System.out.println(a);
    }
}
