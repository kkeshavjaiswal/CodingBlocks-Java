package Lecture06;

public class leetcode875 {
    static int speed(int piles[], int h){
        int low=1;
        int high=1000000000;
        int ans=-1;
        while(low<=high){
            int mid= high-(high-low/2);
            if(check(piles, mid, h )){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static boolean check(int[] piles, int k, int h){
        int temp=0;
        for(int i=0; i<piles.length;i++){
            temp+=piles[i]/k;
            int rem= piles[i]%k;
            if(rem!=0){
                temp++;
            }
        }
        return temp<=h;
    }
    public static void main (String[] args){
        int h=8;
        int piles[]={3,6,7,11};
        int a=speed(piles, h);
        System.out.println(a);
    }
}
