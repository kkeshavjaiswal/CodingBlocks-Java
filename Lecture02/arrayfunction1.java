package Lecture02;

public class arrayfunction1 {
    static void findSum(int[] arr){
        int sum=0;
        for (int i: arr){
            sum += i;
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args){
        int[] arr= {8,2,1,3,4,5};
        findSum(arr);

    }
    
}
