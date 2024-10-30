package Lecture02;

public class arraysfunction8 {
    static void printRev(int[] arr,int i, int j){
        for(int x=arr.length-1; x>0 && x<=j; x--){
            System.out.print(arr[i]+" ");
        // System.out.println();
        }
    }

    public static void main(String[] args){
        int[] arr= {8,2,1,3,4,5};
        printRev(arr,1,3);
    }
    
}
