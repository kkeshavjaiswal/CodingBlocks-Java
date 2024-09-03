public class arrays {
    public static void main(String[] args){
        int a=10;
        int [ ] arr=new int[5];
        arr[0]=78;
        arr[1]=88;
        arr[2]=98;
        arr[3]=108;
        arr[4]=118;
        System.out.println(arr);

        float [ ] nums=new float[10];
        System.out.println(nums);
        
        boolean [ ] fat=new boolean[5];
        System.out.println(fat);

        char [ ] s=new char[10];
        System.out.println(s);
        s[0]='a';
        s[1]='b';
        System.out.println(s);

        //display arrays
        for (int i=0; i<fat.length; i++){
            System.out.println(fat[i]+" ");
        }

        //1. create a table for n

        int n=5;
        int [] table =new int[10];

        for (int j=0; j<table.length; j++){
            table[j]=n*(j+1);
        }
        for (int j=0; j<table.length; j++){
            System.out.println(n+"X"+(j+1)+"="+table[j]);
        }

        //2. search m in this table
        //3. if found print it's index

        int m=40;
        for(int k=0;k<=10;k++){
            if(table[k]==m)
            System.out.println(k);
        }

        Scanner scan= new Scanner(System.in);
        int n;
        n=scan.next();
        System.out.println(n);

    }
    
}
