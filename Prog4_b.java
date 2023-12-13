package StringPrograms;

import java.util.Scanner;

public class Prog4_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string to check for palindrome");
        String str = sc.nextLine();

        char ch1[] = str.toCharArray();
        int len = str.length();
        char ch2[] = new char[len];


        int i=0;
        while(i<len){
            ch2[len-1-i]=ch1[i];
            i++;
        }
        i=0;
        while(i<len) {
            if (ch1[i] != ch2[i]) {
                System.out.println("****Not Palindrome***");
                System.exit(0);
            }
            else{
                ++i;
                continue;
            }
        }
        System.out.println("Palindrome");

    }
}
