package Lecture02;

public class arrayfunction0 {
    
    static void display(int[] arr) {
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // System.out.println();

        // For each loop
        for (int i:arr){
            System.out.print(i+" ");
        // System.out.println();
        }
    }

    public static void main(String[] args){
        int[] arr= {8,2,1,3,4,5};
        display(arr);
    }
}
    
    

