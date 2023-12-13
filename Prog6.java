package StringPrograms;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        char ch1[] = str.toCharArray();
        int len = str.length();
        System.out.print("Original:- ");
        System.out.println(ch1);

        int i=0;
        while(i<len){
            if(ch1[i]!=' ') {
                ch1[i] = (char) (ch1[i] + 32);
            }
            ++i;
        }
        System.out.print("Converted:- ");
//        String strObj = "";
        String s12 = String.valueOf(ch1);
        System.out.println(s12);


    }
}
