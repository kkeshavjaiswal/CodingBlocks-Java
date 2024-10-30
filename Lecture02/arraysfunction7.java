package Lecture02;

public class arraysfunction7 {
    static void newfindSum(int[] arr,int i, int j){
        int sum=0;
        for (int x=i; x<arr.length && x<=j; x++){
            sum += arr[x];
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args){
        int[] arr= {8,2,1,3,4,5};
        newfindSum(arr,1,4);

    }
    
}