package Lecture06;

public class eliminationmethod {
    public static void main (String[] args){
        int low=0;
        int high=200;
        int distance=100;
        int time=2;
        int ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            int tempdistance=mid*time;
            if (tempdistance==distance){
                ans=mid;
                high=mid-1;
            }
            else if(tempdistance<distance){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
