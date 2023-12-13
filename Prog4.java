package StringPrograms;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();

        char ch1[] = a.toCharArray();
        int len = a.length();
        char ch2[] = new char[len];

        int i=0;
        while(i<len){
            ch2[len-1-i]=ch1[i];
            i++;
        }

        String strObj = new String();
        String newStr1 = strObj.valueOf(ch1);
        System.out.print("1st:-");
        System.out.println(newStr1);
        String newStr2 = strObj.valueOf(ch2);
        System.out.print("2nd:-");
        System.out.println(newStr2);
        if(newStr1.equals(newStr2)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("*****Not palindrome****");
        }

    }
}
