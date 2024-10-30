package Lecture07;

public class timecomplexity {

    public static void main (String[] args){
        int N=10;
        for(int i=1; i<=N; i++){
            for (int j=1; j<=i; j+=j){
                System.out.println(" Hi");
            }
        }
    }
}