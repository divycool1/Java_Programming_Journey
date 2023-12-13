package StringPrograms;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1[]=str.toCharArray();
        int len = str.length();
        char ch2[] = new char[len+1];
        int i=0;
        while(i<len){
            ch2[i]=ch1[i];
            i++;
        }
        ch2[i]='9';


        String newStr = new String();
        String newStr2 = newStr.valueOf(ch1);
        String newstr3 = newStr.valueOf(ch2);
        System.out.println(newStr2);
        System.out.println(newstr3);
    }
}
