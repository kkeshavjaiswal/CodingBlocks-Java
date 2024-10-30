package Lecture07;

public class strings {
    static void compare(int i, int j){
        if(i==j)
            System.out.println("0");
        if(i<j)
            System.out.println("-1");
        if(i>j)
            System.out.println("1");
        
    }

    public static void main(String[] args){
        String s1="adi";
        String s2="keshu";
        int i=s1.length();
        int j=s2.length();
        compare(i,j);

        String s0="Phone";
        int[] i0={65,66,67};
        char[] c0={'a','b','c'};
        byte[] b0={65,70,71,72};
        String x0=new String(b0);   //String x0=new String(b0,1,2) where 1 is an offset for first index of the string and 2 is the length or last index
        System.out.println(x0);
    }
}
