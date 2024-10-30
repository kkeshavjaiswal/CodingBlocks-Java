package Lecture07;

public class vowelcount {
    public static void main(String[] args){
        String a="keshav";
        int vowel=0;
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}
