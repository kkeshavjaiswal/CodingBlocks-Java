public class starprint4 {
    public static void main(String[] args){
        int n=5;
        for (int i=1; i<=n; i++){                      // right facing inverted triangle
            for (int j=0; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
            
        }

        //or

        int o=5;
        for (int p=o; p>=1; p--){                      // right facing inverted triangle
            for (int q=1; q<=p; q++){
                System.out.print("*");
            }
            System.out.println(" ");
            
        }

    }
}
