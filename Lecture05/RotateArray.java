package Lecture05;

public class RotateArray {
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++; j--;

        }
    }

    static void display(int[] arr) {
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    //Rotate 1 piece of the array
    public static void rotateByOne(int[] arr){
        int num= arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=num;
    }

    //Rotate piece k times
    public static void rotateByK(int[] arr, int k){
        for(int j=1;j<=k;j++){
            int num= arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=num;
        }
    }

    //Rotate Using Indices
    public static void rotateByIndices(int[] arr, int k){
        int[] temp= new int[arr.length];
        int n= arr.length;
        k%=n;
        for(int i=0; i<n-k; i++){
            temp[i+k]= arr[i];
        }
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }   
    }

    //Final Optimisation (rotating using reverse)

    public static void rotateByRev(int[] arr, int k){
        reverse(arr,0,arr.length-1-k);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main (String[] args){
        int[] arr= {1,2,3,4,5};
        //reverse(arr,1,3);
        //rotateByOne(arr);
        //rotateByK(arr,3);
        //rotateByIndices(arr,3);
        rotateByRev(arr,3);
        display(arr);
    }
    
}