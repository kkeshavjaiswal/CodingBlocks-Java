public class starprint5 {
    public static void main(String[] args){
        int n=5;
        for (int i=1; i<=n; i++){          // left facing inverted triangle
            for (int k=2; k<=i; k++)
                System.out.print(" ");

            for (int j=0; j<=n-i; j++)
                System.out.print("*");
            System.out.println("");
            
        }

        int a=5;
        for (int i=1; i<=a; i++){          // left facing inverted triangle
            for (int k=2; k<=i; k++)
                System.out.print(" ");

            for (int j=0; j<=a-i; j++)
                System.out.print("*");
            System.out.println("");
            
        }
    
    }
}
