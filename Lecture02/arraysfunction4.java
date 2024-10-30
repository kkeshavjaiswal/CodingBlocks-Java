package Lecture02;

public class arraysfunction4 {
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
        int i=2;
        int j=4;
        swapelements(arr, i, j);
        display(arr);
    }
}
