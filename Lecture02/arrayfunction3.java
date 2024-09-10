package Lecture02;

public class arrayfunction3 {

    static void temprev(int[] arr){
        int[] temp= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[arr.length-1-i]=arr[i];
        
        //shallow copy
        // display(temp);
        // arr=temp;
        }
        //deep copy
        for(int i=0; i<arr.length; i++){
            arr[i]=temp[i];
        }
        

    }

    static void display(int[] arr) {
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        int[] arr= {8,2,1,3,4,5};
        temprev(arr);
        display(arr);
    }
    
}
