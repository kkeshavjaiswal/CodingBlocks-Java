package Lecture02;

public class arraysfunction5 {
    static void reverseUsingSwap(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            swapelements(arr,i++,j--);
        }
    }

    static void swapelements(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void display(int[] arr) {
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        int[] arr= {8,2,1,3,4,5};
        // swapelements(arr, i, j);
        reverseUsingSwap(arr);
        display(arr);
    }
}
