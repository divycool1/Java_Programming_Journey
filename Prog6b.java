package StringPrograms;

import java.util.Scanner;

public class Prog6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Original:- "+str);


        int len = str.length();
        char ch1[] = str.toCharArray();
//        char ch2[] = new char[len];

        int i=0;
        while(i!=len){
            if(ch1[i]!=' ') {
                ch1[i] = (char) (ch1[i] - 32);
            }
            i++;
        }

        System.out.print("Final:- ");
        String strObj = new String();
        String a = strObj.valueOf(ch1);
        System.out.print(a);

    }
}
