package StringPrograms;

import java.util.Scanner;

public class Prog3_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        char ch1[]=str.toCharArray();
        int len=str.length();
        char ch2[] = new char[len];

        int i=0;
        while(i<len){
            ch2[len-i-1]=ch1[i];
            i++;
        }
        String strObj = new String();
        String char1 = strObj.valueOf(ch1);
        System.out.println(char1);
        String char2 = strObj.valueOf(ch2);
        System.out.println(char2);
    }
}
