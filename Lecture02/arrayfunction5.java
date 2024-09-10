package Lecture02;

public class arrayfunction5 {
    static void newdisplay(int[] arr, int i, int j){
        for(int x=i; x<arr.length && x<=j; x++){
            System.out.print(arr[x]+" ");
        System.out.println();
        }
    }

    public static void main(String[] args){
        int[] arr= {8,2,1,3,4,5};
        newdisplay(arr,i,j);
    }
    
}
