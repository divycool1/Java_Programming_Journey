package StringPrograms;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome");
        String str = sc.nextLine();
         str = str.toLowerCase();
         str = str.replace(" ","");

        char ch1[] = str.toCharArray();
        int len = str.length();
        char ch2[] = new char[len];

        int i=0;
        while(i<len){
            ch2[len-1-i]=ch1[i];
            i++;
        }
        String strObj = new String();
        String str4 = strObj.valueOf(ch1);
        String str5 = strObj.valueOf(ch2);
        System.out.print("Original string:- ");
        System.out.println(str4);
        System.out.print("Reversed string:- ");
        System.out.println(str5);


        i=0;
        while(i<len) {
            if (ch1[i] != ch2[i]){
                System.out.println("XXXXXX Not a palindrome XXXXX");
                System.exit(0);
            }
            else{
                ++i;
            }
        }
            System.out.println("Palindrome");
    }
}
