package StringPrograms;

import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();
        a = a.toUpperCase();
        a = a.replace(" ","");
        System.out.println("String under operation "+a);


        char ch[] = a.toCharArray();
        int len = a.length();

        int v=0;
        int c=0;
        int ss=0;

        int i=0;
        while(ch[i]<len){
            if(ch[i]>='A' && ch[i]<='Z'){
                if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
                    System.out.println("Before v"+v);
                    ++v;
                    System.out.println("After v"+v);
                }

                else {
                    System.out.println("Before c");
                    ++c;
                    System.out.println("After c");
                }
            }
            System.out.println("Before ss"+ss);
            ++ss;
            System.out.println("After ss"+ss);
            System.out.println("i-before:-"+i);
            ++i;
            System.out.println("i-after:- "+i);
        }
        System.out.println("Vowels:- "+v);
        System.out.println("Consonants:- "+c);
        System.out.println("SpecialSymbols:- "+ss);
        }
}
