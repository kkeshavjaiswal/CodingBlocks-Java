package Lecture06;

public class eliminationmethod1 {
    static boolean check(int speed, int dist, int time){
        return(speed*time>=dist);
    }
    static int reachCollege(int dist, int high, int time){
        int low=0;
        int ans=-1;
        while(low<=high){
            int mid= high-(high-low/2);
            if(check(mid,dist,time)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main (String[] args){
        int high=200;
        int distance=100;
        int time=3;
        int speed=reachCollege(distance, high, time);
        System.out.println(speed);
    }
}
