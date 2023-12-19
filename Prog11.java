package StringPrograms;

import java.util.Scanner;

public class Prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        str = str.toLowerCase();

        char ch[] = new char[25];

        int len = str.length();

        int i=0;
        while(i<len){
            if(ch[i]>='a' && ch[i]<='z'){
                i++;
            }
            else{
                System.out.println("***Not pangram***");
                System.exit(0);
            }
        }
        System.out.println("Pangram");
    }
}
